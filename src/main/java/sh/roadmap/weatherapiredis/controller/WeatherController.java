package sh.roadmap.weatherapiredis.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMapping;
import sh.roadmap.weatherapiredis.model.WeatherResponse;
import sh.roadmap.weatherapiredis.service.WeatherService;

@RestController
//@RequestMapping("/")
public class WeatherController {

    private final WeatherService weatherService;

    WeatherController (WeatherService weatherService){
        this.weatherService = weatherService;
    }

    @GetMapping("/weather")
    public WeatherResponse getWeather(@RequestParam(name = "city") String city){
        return weatherService.getWeather(city);
    }
}
