package com.example.console.dao;

import java.util.ArrayList;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;

import com.example.console.models.Cliente;

public interface ClienteDao extends CrudRepository<Cliente, Integer> {
	


	@Query(value="select * from clientes where nome_do_cliente like %:nome% or telefone like %:telefone% ", nativeQuery = true)
	public ArrayList<Cliente> findAllByNomeTelefone(@Param("nome") String nome, @Param("telefone") String telefone);


}
