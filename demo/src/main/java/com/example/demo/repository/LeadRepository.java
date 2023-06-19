package com.example.demo.repository;

import java.util.List;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.example.demo.model.Lead;

public interface LeadRepository extends MongoRepository<Lead,String> {

	List<Lead> findAll();

	void deleteById(String lead_id);

}
