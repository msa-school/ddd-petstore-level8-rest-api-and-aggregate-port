package com.example.petstore;

import com.example.petstore.domain.Item;
import com.example.petstore.domain.PetReserved;
import com.example.petstore.kafka.KafkaProcessor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.stream.annotation.StreamListener;
import org.springframework.messaging.handler.annotation.Payload;
import org.springframework.stereotype.Service;

@Service
public class PolicyHandler {
    @Autowired
    com.example.petstore.ItemRepository itemRepository;

    @StreamListener(KafkaProcessor.INPUT)
    public void whatever(@Payload String eventString){}

    @StreamListener(KafkaProcessor.INPUT)
    public void wheneverPetReserved_SyncItem(@Payload PetReserved petReserved){
        if(!petReserved.validate())
            return;

        Item item = new Item();
        item.setAppearance(petReserved.getAppearance());
        item.setHealth(petReserved.getEnergy());

        itemRepository.save(item);
    }


}