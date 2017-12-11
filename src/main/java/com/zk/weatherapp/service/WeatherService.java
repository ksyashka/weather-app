package com.zk.weatherapp.service;


import com.zk.weatherapp.exceptions.GetCurrentWeatherException;
import com.zk.weatherapp.model.WeatherInfo;

public interface WeatherService {
    WeatherInfo getCurrentWeather(String city) throws GetCurrentWeatherException;
}
