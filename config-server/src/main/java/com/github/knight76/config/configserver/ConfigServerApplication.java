package com.github.knight76.config.configserver;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.config.server.EnableConfigServer;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
@EnableConfigServer
@SpringBootApplication
@Configuration
public class ConfigServerApplication {

	@RequestMapping(value = "/")
	public @ResponseBody String root() {
		return "Knight76 Config Server";
	}

	@RequestMapping(value = "/health_check_html")
	public @ResponseBody String healthCheck() {
		return "OK";
	}

	public static void main(String[] args) {
		SpringApplication.run(ConfigServerApplication.class, args);
	}
}
