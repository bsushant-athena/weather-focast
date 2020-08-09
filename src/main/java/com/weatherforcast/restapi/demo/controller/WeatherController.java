package com.weatherforcast.restapi.demo.controller;

import com.weatherforcast.restapi.demo.api.*;
import java.text.*;
import java.util.*;
import lombok.extern.slf4j.*;
import org.springframework.beans.factory.annotation.*;
import org.springframework.http.*;
import org.springframework.web.bind.annotation.*;

@RestController
@Slf4j
public class WeatherController {

	@Autowired 
	private WeatherApi weatherService;
	
	@GetMapping(value = "/api/weather/v1",produces = "application/json")
	public ResponseEntity<?> getWeatherReport(){
		 SimpleDateFormat formatter = new SimpleDateFormat("yyy-MM-dd");
		 Date date;
		 return weatherService.getReport();
	}
}
