package com.ticketservicecloud.CinemaTicketService;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@SpringBootApplication
@EnableEurekaServer
public class CinemaEurekaServer {

	public static void main(String[] args) {
		SpringApplication.run(CinemaEurekaServer.class, args);
	}

}
