package com.example;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication //@ComponentScan이 내장되어 있어 Controller를 자동으로 빈 생성해줌
@ComponentScan(basePackages = {"com.example", "board.controller"})
public class Chapter01Application {

	public static void main(String[] args) {
		SpringApplication.run(Chapter01Application.class, args);
	}

}

