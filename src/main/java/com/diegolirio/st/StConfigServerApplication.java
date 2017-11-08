package com.diegolirio.st;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.config.server.EnableConfigServer;

@EnableConfigServer
@SpringBootApplication
public class StConfigServerApplication {

	public static void main(String[] args) {
		SpringApplication.run(StConfigServerApplication.class, args);
	}
}
