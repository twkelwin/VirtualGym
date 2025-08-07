package com.VirtualGym.Controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.VirtualGym.Model.Cadastro;

@RestController
public class CadastroControler {
	
	@GetMapping(value = "kel" )
	public String main() {
		return "guilherme";
	}
	
	@PostMapping("/")
	public void PublicarCadastro(@RequestBody Cadastro cadastro) {
		System.out.println(cadastro);
	}
	
}
