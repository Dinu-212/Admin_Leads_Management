package com.example.demo.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.model.History;
import com.example.demo.repository.HistoryRepository;

@RestController("/hst")
public class HistoryController {

	
	@Autowired
	private HistoryRepository historyRepository;
	
	@GetMapping("/all")
	public List<History> getLeads()
	{
		return historyRepository.findAll();
	}
	
	@GetMapping("/{lead_id}")
    public Optional<History> getLeadById(@PathVariable(value="lead_id") String lead_id)
    
	{
        return historyRepository.findById(lead_id);

    }
}
