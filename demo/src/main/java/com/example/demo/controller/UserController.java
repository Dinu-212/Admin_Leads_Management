package com.example.demo.controller;

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

import com.example.demo.model.User;
import com.example.demo.repository.UserRepository;

@RestController("/usr")
public class UserController {

	@Autowired
	private UserRepository userRepository;
	
	@GetMapping("/user/all")
	public List<User> getUsers()
	{
		return userRepository.findAll();
	}
	
	@GetMapping("/user/{user_id}")
    public Optional<User> getUserById(@PathVariable(value="user_id") String user_id)
    
	{
        return userRepository.findById(user_id);

    }
	
	@PostMapping("/user/add")
	public User postLead(@RequestBody User user)
	{
		return userRepository.save(user);
	}
	
	@DeleteMapping("/user/{user_id}")
	public ResponseEntity<?> deleteLead(@PathVariable(value="user_id") String user_id)
	{
		userRepository.deleteById(user_id);
		return new ResponseEntity<>(HttpStatus.OK);
	}
	
	@PutMapping("/user/{user_id}")
    public User updateLead(@PathVariable(value="user_id") String user_id, @RequestBody User user)
	{
		userRepository.deleteById(user_id);
        return userRepository.save(user);
    }
}
