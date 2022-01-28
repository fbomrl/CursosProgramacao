package br.com.fsilva.projeto1.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

//Criando as anotações necessárias para a conexão com a tabela e recuperação de dados
@Entity
@Table(name="tbcliente")

public class Cliente {
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	
	@Column(name="id")
	private int id;
	
	@Column(name="nome",length=100)
	private String nome;
	
	@Column(name="cpf", length=14)
	private String cpf;
	
	@Column(name="telefone", length=15)
	private String telefone;
	
	@Column(name="email", length=100)
	private String email;
	

	
	public String getNome() {
		return nome;
	}
	
	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getCpf() {
		return cpf;
	}

	public void setCpf(String cpf) {
		this.cpf = cpf;
	}

	public String getTelefone() {
		return telefone;
	}

	public void setTelefone(String telefone) {
		this.telefone = telefone;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public void setId(int id) {
		this.id = id;
	}
	


}