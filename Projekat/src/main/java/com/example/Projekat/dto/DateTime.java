package com.example.Projekat.dto;

import java.time.LocalTime;
import java.util.Date;

import com.fasterxml.jackson.annotation.JsonFormat;

public class DateTime {

	@JsonFormat(pattern="dd.MM.yyyy", shape=JsonFormat.Shape.STRING, timezone="Europe/Madrid")
	private Date datetime;
	
	private LocalTime time;
	
	
	public DateTime() {
		
	}
	

	public Date getDatetime() {
		return datetime;
	}

	public void setDatetime(Date datetime) {
		this.datetime = datetime;
	}


	public LocalTime getTime() {
		return time;
	}


	public void setTime(LocalTime time) {
		this.time = time;
	}
	
	
	
}
