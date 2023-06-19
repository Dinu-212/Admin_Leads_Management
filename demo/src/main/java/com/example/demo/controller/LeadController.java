package com.example.demo.controller;



import java.time.LocalDate;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.util.List;
import java.util.Optional;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.model.History;
import com.example.demo.model.Lead;
import com.example.demo.repository.HistoryRepository;
import com.example.demo.repository.LeadRepository;

@RestController("/ld")
public class LeadController {

	@Autowired
	private LeadRepository leadRepository;
	
	@Autowired
	private HistoryRepository historyRepository;	
	
	private History history;
	// Get current date
	LocalDate currentDate = LocalDate.now();

	// Convert LocalDate to String
	DateTimeFormatter formatterl = DateTimeFormatter.ofPattern("yyyy-MM-dd");
	String currentDateStr = currentDate.format(formatterl);
	// Get current time
    LocalTime currentTime = LocalTime.now();

    // Format time into string
    DateTimeFormatter formatter = DateTimeFormatter.ofPattern("HH:mm:ss");
    String formattedTime = currentTime.format(formatter);
	
	@GetMapping("lead/all")
	public List<Lead> getLeads()
	{
		return leadRepository.findAll();
	}
	
	@GetMapping("lead/{lead_id}")
    public Optional<Lead> getLeadById(@PathVariable(value="lead_id") String lead_id)
	{
        return leadRepository.findById(lead_id);

    }
	
	@PostMapping("lead/add")
	public Lead postLead(@RequestBody Lead lead)
	{
		history=new History(lead.getLead_id(),lead.getAgent_id(),currentDateStr,formattedTime,"Lead is added");
		historyRepository.save(history);
		return leadRepository.save(lead);
	}
	
	@DeleteMapping("lead/{lead_id}")
	public ResponseEntity<?> deleteLead(@PathVariable(value="lead_id") String lead_id)
	{
		history=new History(lead_id,"25",currentDateStr,formattedTime,"Lead is Deleted,done by admin");
		historyRepository.save(history);
		leadRepository.deleteById(lead_id);
		return new ResponseEntity<>(HttpStatus.OK);
	}
	
	@PutMapping("lead/{lead_id}")
    public Lead updateLead(@PathVariable(value="lead_id") String lead_id, @RequestBody Lead lead)
	{
		history=new History(lead_id,"25",currentDateStr,formattedTime,"Lead is Updated to "+lead);
		historyRepository.save(history);
        leadRepository.deleteById(lead_id);
        return leadRepository.save(lead);
    }
	
	
	
}
