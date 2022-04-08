package com.example.petstore;

import com.example.petstore.domain.Item;
import com.example.petstore.domain.PetReserved;
import com.example.petstore.domain.PetUpdated;
import com.example.petstore.domain.ItemRepository;
import com.example.petstore.kafka.KafkaProcessor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.stream.annotation.StreamListener;
import org.springframework.messaging.handler.annotation.Payload;
import org.springframework.stereotype.Service;

@Service
public class PolicyHandler {
    @Autowired
    ItemRepository itemRepository;

    @StreamListener(KafkaProcessor.INPUT)
    public void whatever(@Payload String eventString){}

    @StreamListener(KafkaProcessor.INPUT)
    public void wheneverPetReserved_displayOnTheStore(@Payload PetReserved petReserved){
        if(!petReserved.validate())
            return;

        Item item = new Item();
        item.setAppearance(petReserved.getAppearance());
        item.setHealth(petReserved.getEnergy());
        item.setPetId(petReserved.getId());

        itemRepository.save(item);
    }

    @StreamListener(KafkaProcessor.INPUT)
    public void wheneverPetUpdate_updateItem(@Payload PetUpdated petUpdated){
        if(!petUpdated.validate())
            return;

        itemRepository.findByPetId(petUpdated.getId()).ifPresent(item->{
            item.setAppearance(petUpdated.getAppearance());
            item.setHealth(petUpdated.getEnergy());
            itemRepository.save(item);
        });
      
    }


}