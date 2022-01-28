package com.example.console.models;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="clientes")
public class Cliente {

	
	//Gerar o dado com a primary key
	@Id 
	//Gerar dados com auto_increment
	@GeneratedValue(strategy=GenerationType.IDENTITY) 
	private int id;
	
	//Os dados não podem ser nulos
	@Column(nullable=false, name="nome_cliente", length=100)
	private String nome = "Fabio Meireles";
	@Column(nullable=false, name="telefone_cliente", length=15)
	private String telefone = "91111-2222";

	public String getNome() {
		return this.nome;
	}

	public String getTelefone() {
		return this.telefone;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public void setTelefone(String telefone) {
		this.telefone = telefone;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

}
