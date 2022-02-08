package com.example.WeatherForecast;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class WeatherForecastApplication {
	private static String location;
	private static String main;
	private static String description;
	private int  temp;

public WeatherForecastApplication( String location, String main, String country, String city, int temp);	
 {
		this.main=main;
		this.description=description;
		this.country=country;
		this.city=city;
		this.temp=temp;
	}


	public static String main(String[] args) {

		SpringApplication.run(WeatherForecastApplication.class, args);




}
}
