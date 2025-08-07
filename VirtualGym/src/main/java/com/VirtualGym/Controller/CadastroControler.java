package com.VirtualGym.Controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CadastroControler {
	
	@GetMapping(value = "kel" )
	public String main() {
		return "guilherme";
	}
	
	
}
