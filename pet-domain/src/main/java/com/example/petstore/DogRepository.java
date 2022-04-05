package com.example.petstore;

import com.example.petstore.domain.Dog;

import org.springframework.data.repository.CrudRepository;

public interface DogRepository extends CrudRepository<Dog, Long>{    // Repository Pattern Interface
  
}