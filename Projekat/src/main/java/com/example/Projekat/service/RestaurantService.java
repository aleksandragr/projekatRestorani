package com.example.Projekat.service;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.EnableAspectJAutoProxy;
import org.springframework.stereotype.Service;

import com.example.Projekat.dto.DateTime;
import com.example.Projekat.model.Restaurant;
import com.example.Projekat.model.WorkHour;
import com.example.Projekat.repository.RestaurantRepository;
import com.example.Projekat.repository.WorkHourRepository;

@Service
public class RestaurantService {
	
	@Autowired
	private RestaurantRepository restaurantRepository;
	
	@Autowired
	private WorkHourRepository workHourRepository;
	
	
	public ArrayList<String> findR(DateTime date) {
		
		System.out.println("TIMEEEEEEEE = "  + date.getTime());
		
		DateFormat dateFormat = new SimpleDateFormat("dd.MM.yyyy HH:mm");
		Date date1 = date.getDatetime();
		

		SimpleDateFormat sdf = new SimpleDateFormat("dd.MM.yyyy HH:mm", java.util.Locale.ENGLISH);
		Date myDate = new Date();
		try {
			myDate = sdf.parse(dateFormat.format(date1));
		} catch (ParseException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		sdf.applyPattern("EEE");
		String sMyDate = sdf.format(myDate);
		
		System.out.println("Dan iz postmena: " + sMyDate);
		
		ArrayList<WorkHour> listWorinHour = workHourRepository.findByDayEquals(sMyDate);
		
		
		ArrayList<String> allrestaurants = new ArrayList<>();

		for(WorkHour wh : listWorinHour) {
			Restaurant r =  restaurantRepository.findByWorkhour_idEquals(wh.getId());
			if(r != null) {
				
				if(date.getTime().isAfter(wh.getStarttime()) && date.getTime().isBefore(wh.getEndtime())) {
					allrestaurants.add(r.getName());
				}
			}
		}
		
		
		
		
		
		
		
		
		
		
		
		return allrestaurants;
		
	}

}
