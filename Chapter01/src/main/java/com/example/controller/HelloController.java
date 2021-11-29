package com.example.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController //URL이 들어올 때, *.jsp 찾는 것이 아니라 그대로 화면에 뿌림, @ResponseBody 안 써도 됨
public class HelloController {
	
	public HelloController() { //빈 등록이 되었으므로 생성자가 콘솔창에 뜬다
		System.out.println("HelloController 기본생성자");
	}
	
	//@RequestMapping(value="/hello", method=RequestMethod.GET)
	@GetMapping("/hello")
	public String hello(String name) {
		return "hello " + name;
	}
}

