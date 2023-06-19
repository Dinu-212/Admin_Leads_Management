package com.example.demo.repository;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.example.demo.model.History;

public interface HistoryRepository extends MongoRepository<History,String> {

}
