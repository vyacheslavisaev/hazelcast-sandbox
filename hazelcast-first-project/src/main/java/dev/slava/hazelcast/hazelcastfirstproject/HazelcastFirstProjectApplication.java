package dev.slava.hazelcast.hazelcastfirstproject;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;

@SpringBootApplication(exclude = {DataSourceAutoConfiguration.class })
public class HazelcastFirstProjectApplication {

	public static void main(String[] args) {
		SpringApplication.run(HazelcastFirstProjectApplication.class, args);
	}

}
