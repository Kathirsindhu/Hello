package com.hello.hello;
@RestController
public class Myconfig {
	@GetMapping("/hello")
	public static void main(String[] args) {
		System.out.println("hello world");
	}

}
