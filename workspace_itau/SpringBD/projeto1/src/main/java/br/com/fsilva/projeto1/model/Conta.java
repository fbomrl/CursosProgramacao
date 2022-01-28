package br.com.fsilva.projeto1.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

//Criando as anotações necessárias para a conexão com a tabela e recuperação de dados
@Entity
@Table(name="tbconta")

public class Conta {

	//Inserindo o campo de atributo que indica a chave primária
	@Id
	//Vamos inserir todos os campos com os respectivos tipos de dados da nossa tabela de contas
	@Column(name="numero")
	private int numero;
	@Column(name="agencia")
	private int agencia;
	@Column(name="tipo")
	private int tipo;
	@Column(name="saldo")
	private double saldo;
	
	
	//Chamando o campo de viculo com outra tabela
	@ManyToOne
	@JoinColumn(name="id_titular")
	private Cliente titular;


	public int getNumero() {
		return numero;
	}


	public void setNumero(int numero) {
		this.numero = numero;
	}


	public int getAgencia() {
		return agencia;
	}


	public void setAgencia(int agencia) {
		this.agencia = agencia;
	}


	public int getTipo() {
		return tipo;
	}


	public void setTipo(int tipo) {
		this.tipo = tipo;
	}


	public double getSaldo() {
		return saldo;
	}


	public void setSaldo(double saldo) {
		this.saldo = saldo;
	}


	
}
