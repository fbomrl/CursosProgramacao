package br.com.fsilva.projeto1.dao;

import java.util.ArrayList;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

import br.com.fsilva.projeto1.model.Conta;

// extends amplia as características da classe que iremos colocar
public interface ContaDao extends CrudRepository<Conta,Integer>{

	@Query(value="select * from tbconta where agencia = :agencia", nativeQuery = true)
	public ArrayList<Conta> FindAllByAgencia(int agencia);
}