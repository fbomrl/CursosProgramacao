package br.com.mrlsilva.projeto.controller;

import br.com.mrlsilva.projeto.dao.ContaDao;
import br.com.mrlsilva.projeto.model.ContaModel;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.persistence.Id;
import java.util.ArrayList;

@RestController
public class ContaController {

    @Autowired
    private ContaDao dao;

    @GetMapping("/clientes")
    //Criar um método para retornar os registros da nossa tabela
    public ArrayList<ContaModel> recuperarTudo(){
        ArrayList<ContaModel> lista;
        lista = (ArrayList<ContaModel>)dao.findAll();
        return lista;
    }



}
