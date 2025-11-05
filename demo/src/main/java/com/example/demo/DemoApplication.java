package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@SpringBootApplication
public class DemoApplication {

	public static void main(String[] args) {
		SpringApplication.run(DemoApplication.class, args);
		System.out.println("Hola");
	}

	@RequestMapping("/")
	public String home() {
		System.out.println("Bienvenido");
		return "Bienvenido";
	}

	@RequestMapping("/hola")
	public String hola() {
		System.out.println("Hola");
		return "Hola";
	}

	@RequestMapping("/adios")
	public String adios(){
		System.out.println("Adios");
		return "Adios";
	}

		@RequestMapping("/html")
	public String html(){
		String html = "<html><body><h1>Hola html</h1><p>lorem</p></body></html>";
		return html;
	}

}
