package com.example.demo.repositories;

import com.example.demo.entities.Page;
import org.springframework.data.repository.CrudRepository;

public interface PageRepository extends CrudRepository<Page,Integer> {
}
