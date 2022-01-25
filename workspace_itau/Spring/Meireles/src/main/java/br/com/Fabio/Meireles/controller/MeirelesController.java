package br.com.Fabio.Meireles.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MeirelesController {

	@GetMapping("/meunome")

	public String meuNome() {

		return "<h2>Nome: </h2> <h3>Fábio Meireles da Silva</h3>";
	}

}
