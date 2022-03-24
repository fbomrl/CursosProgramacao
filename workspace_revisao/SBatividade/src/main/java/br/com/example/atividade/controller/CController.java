package br.com.example.atividade.controller;

import br.com.example.atividade.dao.CorrentistasDao;
import br.com.example.atividade.dao.FluxoDao;
import br.com.example.atividade.model.CorrentistasModel;
import br.com.example.atividade.model.FluxoModel;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;

@RestController
public class CController {

    @Autowired
    private CorrentistasDao dao;
    private FluxoDao fluxoDao;


    @GetMapping("/correntistas")
    ArrayList<CorrentistasModel> todosDados() {
        ArrayList<CorrentistasModel> lista;
        lista = (ArrayList<CorrentistasModel>) dao.findAll();
        return lista;
    }
    @GetMapping("/fluxocaixa")
    ArrayList<FluxoModel> listafluxo(){
        ArrayList<FluxoModel> listafluxo;
        listafluxo = (ArrayList<FluxoModel>) fluxoDao.findAll();
        return listafluxo;
    }

}
