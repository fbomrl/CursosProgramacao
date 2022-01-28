package com.example.console.controllers;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.console.dao.ClienteDao;
import com.example.console.models.Cliente;

@RestController
public class ClientesController {
	@Autowired
	private ClienteDao clienteDao;

	@GetMapping("/teste")
	public String teste() {

		return "Teste Teste Teste Teste Teste Teste Teste";
	}

	@GetMapping("/cliente")
	public Cliente cliente() {
		var c = new Cliente();
		c.setNome("Fabio Silva");
		c.setTelefone("91234-5555");
		
		clienteDao.save(c);
		
		return c;
	}

	@GetMapping("/clientes")
	public ArrayList<Cliente> listaDeClientes(String nome, String telefone) {
		var lista = clienteDao.findAllByNomeTelefone(nome, telefone);
		return (ArrayList<Cliente>)lista;
	}


	// Definindo uma rota coringa
	@GetMapping("/cliente/{id}")
	// Recebendo o parâmetro da rota coringa
	public String rotaCoringa(@PathVariable int id) {
		return "O Resultado do parâmetro é: " + id;
	}

}
