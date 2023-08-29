package com.hello.hello;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Myconfig {
	@GetMapping
	public static void main(String[] args) {
		System.out.println("hello world");
	}

}
