package com.example.Projekat.controller;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.DayOfWeek;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.format.TextStyle;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.Locale;

import javax.print.attribute.standard.DateTimeAtCompleted;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.Projekat.dto.DateTime;
import com.example.Projekat.model.Restaurant;
import com.example.Projekat.service.RestaurantService;

@RequestMapping("/restaurant")
@RestController
public class RestaurantController {
	
	@Autowired
	private RestaurantService restaurantService;
	
	@PostMapping("/findRestaurant")
	public ResponseEntity<ArrayList<String>> findOpenRestaurants(@RequestBody DateTime date){
		
		ArrayList<String> restaurants = restaurantService.findR(date);
		
		return new ResponseEntity<>(restaurants, HttpStatus.OK);
		

	}

}
