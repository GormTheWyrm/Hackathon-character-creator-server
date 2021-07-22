package com.revature.charactercreation.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.revature.charactercreation.models.Hero;
import com.revature.charactercreation.repository.HeroRepository;

@Service
@Transactional
public class HeroService {
	
	@Autowired 
	HeroRepository repo; 
	
	public Hero createHero(Hero hero) { 
		Hero newHero = repo.save(hero); 
		return hero; 
	}
	
	public List<Hero> getAllheroes(String username) { 
		List<Hero> characterList = repo.findByUsername(username); 
		return characterList; 
	}
	
	public Hero updateHero(Hero hero) { 
		Hero updatedHero = repo.findById(hero.getId()).get();  
		
		updatedHero.setStrength(hero.getStrength());
		updatedHero.setIntelligence(hero.getIntelligence());
		updatedHero.setCharisma(hero.getCharisma());
		updatedHero.setDexterity(hero.getDexterity());
		updatedHero.setConstitution(hero.getConstitution());
		updatedHero.setWillpower(hero.getWillpower());
		updatedHero.setWisdom(hero.getWisdom());
		
		updatedHero.setEyecolor(hero.getEyecolor());
		updatedHero.setHaircolor(hero.getHaircolor());
		
		repo.save(updatedHero); 
		
		return updatedHero;
	}
}
