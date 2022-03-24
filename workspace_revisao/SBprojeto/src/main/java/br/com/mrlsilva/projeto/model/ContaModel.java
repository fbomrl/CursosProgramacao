package br.com.mrlsilva.projeto.model;

import javax.persistence.*;

@Entity
@Table(name = "tbcliente")
public class ContaModel {
    //Definir através de uma anotaçao os campos existentes da nossa tabela
    @Id
    @GeneratedValue
    //Iremos referenciar todos os campos e existentes da nossa tabela
    @Column(name = "nome")
    private String nome;

    @Column(name = "cpf")
    private String cpf;

    @Column(name = "email")
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

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
}
