package com.revature.charactercreation.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.revature.charactercreation.models.Hero;
import com.revature.charactercreation.service.HeroService;

@RestController
@CrossOrigin("*")
@RequestMapping("/heroes")
public class HeroController {

	@Autowired 
	HeroService service; 
	
	@PostMapping("/add") 
	public ResponseEntity<Hero> addHero(@RequestBody Hero hero) { 
		Hero newHero = service.createHero(hero); 
		System.out.println("Brother"); 
		return ResponseEntity.ok().body(newHero); 
	}
	
	@GetMapping("/{username}")
	public ResponseEntity<List<Hero>> getUserHeroes(@PathVariable("username")String username) { 
		List<Hero> HeroList = service.getAllheroes(username);
		return ResponseEntity.ok().body(HeroList); 
	}
	
	@PutMapping("/update")
	public ResponseEntity<Hero> updateHero(@RequestBody Hero hero) {
		Hero updatedHero = service.updateHero(hero); 
		return ResponseEntity.ok().body(updatedHero); 
	}
	
	
}
