package br.com.rabgestaoti.Hello.Controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
//Solicitação API
//@ serve para fazer uma chamada com anotação para ambiente WEB
@RestController
public class HelloController {
	//anotação utilizada para ver o caminho da nossa página
	@GetMapping("/teste")
	//Criar um método com o conteúdo que será demonstrado na nossa página
	public String testeHello() {
		//return "Minha primeira página";
		return "<h2> Minha primeira página na web com SpringBoot </h2>";
	}
}
