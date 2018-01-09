package org.server;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;


@EnableEurekaServer
@SpringBootApplication
public class StartServerApplication {

	public static void main(String[] args) {
		SpringApplication.run(StartServerApplication.class, args);
	}

}
