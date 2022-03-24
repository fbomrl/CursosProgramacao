package br.com.example.atividade.dao;

import br.com.example.atividade.model.FluxoModel;
import org.springframework.data.repository.CrudRepository;

public interface FluxoDao extends CrudRepository<FluxoModel, Integer> {
}
