package com.example.Projekat;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.LocalTime;
import java.util.Date;
import java.util.HashSet;
import java.util.Locale;
import java.util.Set;

import javax.annotation.PostConstruct;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.example.Projekat.model.Restaurant;
import com.example.Projekat.model.WorkHour;
import com.example.Projekat.repository.RestaurantRepository;
import com.example.Projekat.repository.WorkHourRepository;

@Component
public class StartData {
	
	@Autowired
	private RestaurantRepository restaurantRepository;
	
	@Autowired
	private WorkHourRepository workHourRepository;
	
	@PostConstruct
	private void init() {
		 
		
		Set<WorkHour> w1 = new HashSet<>();
		
		LocalTime startTime1 = LocalTime.parse("11:30");
		LocalTime endtime = LocalTime.parse("21:00");
		
		WorkHour workhour1 = new WorkHour(null, "Mon", startTime1, endtime);
		w1.add(workhour1);
		Restaurant r = new Restaurant(null, "Kushi Tsuru", w1);
		
		workHourRepository.save(workhour1);
		restaurantRepository.save(r);
	}

}
