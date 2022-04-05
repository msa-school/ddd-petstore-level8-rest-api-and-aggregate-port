package com.example.petstore;

import com.example.petstore.domain.Cat;

import org.springframework.data.repository.CrudRepository;

public interface CatRepository extends CrudRepository<Cat, Long>{    // Repository Pattern Interface
  
}