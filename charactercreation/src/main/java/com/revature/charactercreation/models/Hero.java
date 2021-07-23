package com.revature.charactercreation.models;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Data;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;

@Entity
@Table (name = "heroes")
@NoArgsConstructor
@AllArgsConstructor
public @Data class Hero {
	
	@Id
	@Column (name = "character_id")
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int id; 
	
	@Column (name = "class")
	private String classType; 
	
	@Column (name = "username")
	private String username; 
	
	//attributes
	private int strength; 
	private int dexterity; 
	private int intelligence; 
	private int charisma; 
	private int wisdom; 
	private int willpower; 
	private int constitution; 
	
	//personalization; 
	private String name; 
	private String race; 
	private String gender; 
	private String hairColor; 
	private String eyeColor;
	private String skinTone; 
	
}
