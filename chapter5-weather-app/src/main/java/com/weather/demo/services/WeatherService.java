package com.weather.demo.services;

import com.weather.demo.dao.Weather;
import com.weather.demo.dao.WeatherRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class WeatherService {

    @Autowired
    private WeatherRepository weatherRepository;

    public List<Weather> getWeatherByCity(String city) {
        return weatherRepository.findByCity(city);
    }

    public List<Weather> getWeatherData() {
        return weatherRepository.findAll();
    }

    public Weather saveWeather(Weather weather) {
        return weatherRepository.save(weather);
    }
}
