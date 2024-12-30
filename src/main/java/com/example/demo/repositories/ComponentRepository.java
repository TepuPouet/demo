package com.example.demo.repositories;

import com.example.demo.entities.Component;
import org.springframework.data.repository.CrudRepository;

public interface ComponentRepository extends CrudRepository<Component, Integer> {
}
