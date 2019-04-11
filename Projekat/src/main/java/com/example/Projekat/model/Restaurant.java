package com.example.Projekat.model;

import java.util.HashSet;
import java.util.Set;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;

@Entity
public class Restaurant {
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Long id;
	
	private String name;
	
	@OneToMany
	private Set<WorkHour> workhour = new HashSet<>();
	
	
	
	
	public Restaurant() {
		
		
	}

	public Restaurant(Long id, String name, Set<WorkHour> workhour) {
		
		this.id = id;
		this.name = name;
		this.workhour = workhour;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Set<WorkHour> getWorkhour() {
		return workhour;
	}

	public void setWorkhour(Set<WorkHour> workhour) {
		this.workhour = workhour;
	}
	
	
	
}
