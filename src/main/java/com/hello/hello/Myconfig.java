package com.hello.hello;
<<<<<<< HEAD

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Myconfig {
	@GetMapping
=======
@RestController
public class Myconfig {
	@GetMapping("/hello")
>>>>>>> b7d2ae4730e249ef1cd49b95df2d7763ff32b665
	public static void main(String[] args) {
		System.out.println("hello world");
	}

}
