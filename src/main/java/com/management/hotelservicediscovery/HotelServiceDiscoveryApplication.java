package com.management.hotelservicediscovery;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@SpringBootApplication
@EnableEurekaServer
public class HotelServiceDiscoveryApplication {

	public static void main(String[] args) {
		SpringApplication.run(HotelServiceDiscoveryApplication.class, args);
	}

}
