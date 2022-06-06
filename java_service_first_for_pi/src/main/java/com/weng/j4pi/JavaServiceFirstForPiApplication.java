package com.weng.j4pi;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;

@SpringBootApplication
public class JavaServiceFirstForPiApplication extends SpringBootServletInitializer {

	public static void main(String[] args) {
		SpringApplication.run(JavaServiceFirstForPiApplication.class, args);
		// LOGGER.info("SpringBoot启动成功...");
	}

	@Override
	protected SpringApplicationBuilder configure(SpringApplicationBuilder builder)
	{
		return builder.sources(JavaServiceFirstForPiApplication.class);
	}

}
