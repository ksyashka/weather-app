package com.zk.weatherapp.controller;


import com.zk.weatherapp.exceptions.GetCurrentWeatherException;
import com.zk.weatherapp.model.WeatherInfo;
import com.zk.weatherapp.service.WeatherService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping(path= "/weather")
public class WeatherController {
    private final WeatherService weatherService;

    @Autowired
    public WeatherController(WeatherService weatherService) {
        this.weatherService = weatherService;
    }

    @RequestMapping(path = "/get", method = RequestMethod.GET)
    public ResponseEntity<WeatherInfo> getCurrentWeather(@RequestParam String city) throws GetCurrentWeatherException {
        return new ResponseEntity<>(weatherService.getCurrentWeather(city), HttpStatus.OK);
    }
}
