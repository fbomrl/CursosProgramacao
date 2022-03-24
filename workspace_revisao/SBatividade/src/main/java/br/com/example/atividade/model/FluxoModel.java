package br.com.example.atividade.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "fluxo_caixa")
public class FluxoModel {
    @Id
    @Column(name = "agencia")
    private Integer agencia;
    @Column(name = "conta")
    private Integer conta;
    @Column(name = "fluxo")
    private Integer fluxo;
    @Column(name = "Entrada")
    private double entrada;
    @Column(name = "Saida")
    private double saida;

    public Integer getAgencia() {
        return agencia;
    }

    public void setAgencia(Integer agencia) {
        this.agencia = agencia;
    }

    public Integer getConta() {
        return conta;
    }

    public void setConta(Integer conta) {
        this.conta = conta;
    }

    public Integer getFluxo() {
        return fluxo;
    }

    public void setFluxo(Integer fluxo) {
        this.fluxo = fluxo;
    }

    public double getEntrada() {
        return entrada;
    }

    public void setEntrada(double entrada) {
        this.entrada = entrada;
    }

    public double getSaida() {
        return saida;
    }

    public void setSaida(double saida) {
        this.saida = saida;
    }
}
