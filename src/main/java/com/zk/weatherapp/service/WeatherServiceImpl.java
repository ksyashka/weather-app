package com.zk.weatherapp.service;

import com.zk.weatherapp.exceptions.GetCurrentWeatherException;
import com.zk.weatherapp.model.WeatherInfo;
import com.zk.weatherapp.model.WeatherInfoSchema;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;
import org.springframework.web.client.RestClientException;
import org.springframework.web.util.UriComponentsBuilder;

import java.net.URI;

@Service
public class WeatherServiceImpl implements WeatherService{

    private static final String accessKey = "4f5d8f38ab164b71b0f263e386b2289d";

    public WeatherInfo getCurrentWeather(String city) throws GetCurrentWeatherException {
        RestTemplate restTemplate = new RestTemplate();

        URI request = UriComponentsBuilder.fromHttpUrl
                ("http://api.openweathermap.org/data/2.5/weather?q="+city+"&APPID="+accessKey)
                .build().toUri();

        WeatherInfoSchema weatherInfoSchema;

        try {
            weatherInfoSchema = restTemplate.getForObject(request, WeatherInfoSchema.class);
        } catch (RestClientException e) {
            throw new GetCurrentWeatherException("Can't get current weather");
        }

        return weatherInfoSchema.getMain();
    }
}
