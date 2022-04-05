package com.example.petstore;


import com.example.petstore.domain.*;

import org.springframework.data.repository.CrudRepository;

public interface ItemRepository extends CrudRepository<Item, Long>{    // Repository Pattern Interface
  
}