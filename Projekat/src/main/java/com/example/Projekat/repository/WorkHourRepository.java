package com.example.Projekat.repository;

import java.util.ArrayList;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.Projekat.model.WorkHour;

public interface WorkHourRepository extends JpaRepository<WorkHour, Long>{
	
	ArrayList<WorkHour> findByDayEquals(String day);

}
