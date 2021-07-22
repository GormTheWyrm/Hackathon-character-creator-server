package com.revature.charactercreation.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.revature.charactercreation.models.Hero;

@Repository
public interface HeroRepository extends JpaRepository<Hero, Integer> {
	@Query(value = "SELECT * FROM heroes WHERE heroes.username = :username", nativeQuery = true)
	List<Hero> findByUsername(@Param("username") String username); 
}
