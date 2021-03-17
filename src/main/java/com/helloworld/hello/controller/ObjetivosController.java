package com.helloworld.hello.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping ("/ObjetivosController")
 
	public class ObjetivosController {
		@GetMapping
		public String Hello() {
			return "Se concentrar, ser paciente e ser produtiva";
					
		} 
	}
		