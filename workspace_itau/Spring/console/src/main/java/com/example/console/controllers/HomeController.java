package com.example.console.controllers;

import java.util.ArrayList;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.console.models.Cliente;

@RestController
public class HomeController {
	@GetMapping("/")
	public String index() {

		return "Bem vindo alunos";
	}

	/*@GetMapping("/teste")
	public String teste() {

		return "Teste Teste Teste Teste Teste Teste Teste";
	}

	@GetMapping("/cliente")
	public Cliente cliente() {
		return new Cliente();
	}

	@GetMapping("/clientes")
	public ArrayList<Cliente> listaDeClientes() {
		var lista = new ArrayList<Cliente>();
		lista.add(new Cliente());
		lista.add(new Cliente());
		lista.add(new Cliente());

		return lista;
	}

	// Definindo uma rota coringa
	@GetMapping("/cliente/{id}")
	// Recebendo o parâmetro da rota coringa
	public String rotaCoringa(@PathVariable int id) {
		return "O Resultado do parâmetro é: " + id;
	}

}
*/
}
