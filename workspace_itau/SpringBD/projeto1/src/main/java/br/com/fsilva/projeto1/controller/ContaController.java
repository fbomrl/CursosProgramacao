package br.com.fsilva.projeto1.controller;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import br.com.fsilva.projeto1.dao.ContaDao;
import br.com.fsilva.projeto1.model.Conta;



@RestController
public class ContaController {

	@Autowired
	private ContaDao dao;
	
	
	// vamos agora criar um método
	@GetMapping("/contas")
	public ArrayList<Conta> recuperarTudo(){
		ArrayList<Conta> lista;
		lista = (ArrayList<Conta>)dao.findAll();
		return lista;
	}
	
	// Criar um contexto de filtro para a nossa API 
	@GetMapping("/contas/{numero}")
	public Conta recuperarConta(@PathVariable int numero) {
		var conta = dao.findById(numero).orElse(null);
		return conta;
	}

	@GetMapping("/contas-por-agencia/{agencia}")
	public ArrayList<Conta> contas_por_agencia(@PathVariable int agencia) {
		var contas = dao.FindAllByAgencia(agencia);
		return contas;
	}
	
 
}
