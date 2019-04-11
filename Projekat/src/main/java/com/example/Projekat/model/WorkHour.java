package com.example.Projekat.model;

import java.time.LocalTime;
import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import com.fasterxml.jackson.annotation.JsonFormat;

@Entity
public class WorkHour {
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Long id;
	
	private String day;
	
	private LocalTime starttime;
	
	private LocalTime endtime;
	
	
	public WorkHour() {
		
		
	}
	
	


	public WorkHour(Long id, String day, LocalTime starttime, LocalTime endtime) {
		this.id = id;
		this.day = day;
		this.starttime = starttime;
		this.endtime = endtime;
	}




	public Long getId() {
		return id;
	}


	public void setId(Long id) {
		this.id = id;
	}


	public String getDay() {
		return day;
	}


	public void setDay(String day) {
		this.day = day;
	}


	public LocalTime getStarttime() {
		return starttime;
	}


	public void setStarttime(LocalTime starttime) {
		this.starttime = starttime;
	}


	public LocalTime getEndtime() {
		return endtime;
	}


	public void setEndtime(LocalTime endtime) {
		this.endtime = endtime;
	}

	
	

}
