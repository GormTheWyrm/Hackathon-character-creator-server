package com.revature.charactercreation.models;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;

@Entity
@Table (name = "heroes")
@NoArgsConstructor
@AllArgsConstructor
public class hero {
	
	@Id
	private int id; 
	private String classtype; 
	
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
	private String haircolor; 
	private String eyecolor;
	private String skintone; 
	
}
