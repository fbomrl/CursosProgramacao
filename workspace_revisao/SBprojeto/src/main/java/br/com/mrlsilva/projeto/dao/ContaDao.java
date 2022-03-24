package br.com.mrlsilva.projeto.dao;

import br.com.mrlsilva.projeto.model.ContaModel;
import org.springframework.data.repository.CrudRepository;



public interface ContaDao extends CrudRepository<ContaModel, Integer> {



}
