package com.weather.demo.services;

import com.fasterxml.jackson.databind.JsonNode;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;
import org.springframework.web.util.UriComponentsBuilder;

import java.util.HashMap;
import java.util.Map;

@Service
public class WeatherAPIService {

    @Value("${weather.api.url}")
    private String weatherApiUrl;

    @Value("${weather.api.key}")
    private String apiKey;

    @Value("${weather.api.units}")
    private String units;

    private final RestTemplate restTemplate = new RestTemplate();

    public Map<String, Object> getRealTimeWeather(String city) {

        String url = UriComponentsBuilder.fromHttpUrl(weatherApiUrl)
                .queryParam("q", city)
                .queryParam("appid", apiKey)
                .queryParam("units", units)
                .toUriString();

        JsonNode response = restTemplate.getForObject(url, JsonNode.class);

        if (response == null || !response.has("cod") || response.get("cod").asInt() != 200) {
            throw new RuntimeException("Failed to fetch weather data for city: " + city);
        }

        Map<String, Object> weatherData = new HashMap<>();
        weatherData.put("city", city);
        weatherData.put("temperature", response.get("main").get("temp").asText() + "°C");
        weatherData.put("description", response.get("weather").get(0).get("description").asText());
        weatherData.put("humidity", response.get("main").get("humidity").asText() + "%");
        weatherData.put("wind_speed", response.get("wind").get("speed").asText() + " m/s");

        return weatherData;
    }
}
