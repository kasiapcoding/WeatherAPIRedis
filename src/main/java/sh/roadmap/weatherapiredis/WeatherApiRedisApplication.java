package sh.roadmap.weatherapiredis;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cache.annotation.EnableCaching;

@SpringBootApplication
@EnableCaching
public class WeatherApiRedisApplication {

	public static void main(String[] args) {
		SpringApplication.run(WeatherApiRedisApplication.class, args);
	}

}
