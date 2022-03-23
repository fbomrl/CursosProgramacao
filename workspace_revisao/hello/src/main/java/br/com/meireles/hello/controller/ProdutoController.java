package br.com.meireles.hello.controller;

import br.com.meireles.hello.model.Produto;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;



@RestController
public class ProdutoController {

    @GetMapping("/produto")
    public Produto exibirProduto() {
        Produto p = new Produto(12345,"Computador top de linha pro Antonio", 2500);
        return p;
    }

    @PostMapping("/produto")
    public String receberProduto(@RequestBody Produto p) {
        System.out.println("Produto recebido = "+p);
        return "OK";
    }

}