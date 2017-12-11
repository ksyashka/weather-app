package com.zk.weatherapp.service;

import com.zk.weatherapp.exceptions.GetCurrentWeatherException;
import com.zk.weatherapp.model.WeatherInfo;
import org.springframework.stereotype.Service;

@Service
public class WeatherServiceImpl implements WeatherService{

    public WeatherInfo getCurrentWeather(String city) throws GetCurrentWeatherException {
        return null;
    }
}
