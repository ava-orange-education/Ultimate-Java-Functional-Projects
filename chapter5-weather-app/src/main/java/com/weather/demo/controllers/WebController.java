package com.weather.demo.controllers;

import com.weather.demo.dao.Weather;
import com.weather.demo.services.WeatherService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.List;

@Controller
public class WebController {

    @Autowired
    private WeatherService weatherService;

    @GetMapping("/weather")
    public String viewWeather(@RequestParam String city, Model model) {
        List<Weather> weatherList = weatherService.getWeatherByCity(city);
        model.addAttribute("weatherList", weatherList);
        return "index";
    }

    @GetMapping("/")
    public String home() {
        return "index";
    }
}
