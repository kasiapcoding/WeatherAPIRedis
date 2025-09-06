package sh.roadmap.weatherapiredis.service;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;
import sh.roadmap.weatherapiredis.model.WeatherResponse;

@Service
public class WeatherService {

    @Value("${weather.api.key}")
    private String apiKey;

    @Value("${weather.api.url}")
    private String apiUrl;

    private final RestTemplate restTemplate = new RestTemplate();


    @Cacheable(value = "weather", key = "#city")
    public WeatherResponse getWeather(String city){
        String url = apiUrl + "/" + city + "?unitGroup=us&key=" + apiKey + "&contentType=json";
        System.out.println("Fetching weather from the api or city: "+ city);
        return restTemplate.getForObject(url, WeatherResponse.class);
    }

}
