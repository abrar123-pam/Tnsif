package com.tnsif.abrar.PlacementManagementSystem.controller;

import org.springframework.web.bind.annotation.RestController;

import com.tnsif.abrar.PlacementManagementSystem.interview.Interview;
import com.tnsif.abrar.PlacementManagementSystem.repository.InterviewRepository;

import java.time.LocalDate;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;

@RestController
public class InterviewController {
	
	@Autowired
	InterviewRepository repo;
	
	//@GetMapping("/product")
	@PostMapping("/interview")
	public Interview addDetails(@RequestBody Interview i) {
		
		LocalDate currentDate = LocalDate.now();
	    
	   
		//Interview i = new Interview(21,currentDate, "Chennai","selected");
		return repo.save(i);	
	}
	
	
	@GetMapping("/interview")
	public List<Interview> viewDetails() {
		return repo.findAll();
	}
	
	@GetMapping("/interview/{id}")
	public Interview viewDetailsById(@PathVariable Integer id) {
		return repo.findById(id).get();
	}
	
	@DeleteMapping("/interview/{id}")
	public void deleteDetails(@PathVariable Integer id) {
		repo.deleteById(id);
	}
	
	@PutMapping("/interview/{id}")
	public Interview updateDetails(@PathVariable Integer id,@RequestBody Interview i) {
		i.setInterviewId(id);
		return repo.save(i);
	}
}
