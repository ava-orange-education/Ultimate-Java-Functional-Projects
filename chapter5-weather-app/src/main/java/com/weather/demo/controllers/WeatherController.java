package com.weather.demo.controllers;

import com.weather.demo.dao.Weather;
import com.weather.demo.services.WeatherAPIService;
import com.weather.demo.services.WeatherService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Map;

@RestController
@RequestMapping("/api/weather")
public class WeatherController {

    @Autowired
    private WeatherService weatherService;

    @Autowired
    private WeatherAPIService weatherAPIService;

    @GetMapping
    public List<Weather> getWeatherData() {
        return weatherService.getWeatherData();
    }

    @GetMapping("/{city}")
    public Map<String, Object> getWeather(@PathVariable String city) {
        return weatherAPIService.getRealTimeWeather(city);
    }
}
