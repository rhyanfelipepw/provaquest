package com.prova0707.demo.model;

import javax.persistence.*;

@Entity(name = "tbProdutos")
public class Produtos {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    Integer idProduto;
    @Column
    String nmProduto;
    @Column
    double vlProduto;
    @ManyToOne
    Empresa empresa;

    public Produtos(Integer idProduto, String nmProduto, double vlProduto, Empresa empresa) {
        this.idProduto = idProduto;
        this.nmProduto = nmProduto;
        this.vlProduto = vlProduto;
        this.empresa = empresa;
    }

    public Integer getIdProduto() {
        return idProduto;
    }

    public void setIdProduto(Integer idProduto) {
        this.idProduto = idProduto;
    }

    public String getNmProduto() {
        return nmProduto;
    }

    public void setNmProduto(String nmProduto) {
        this.nmProduto = nmProduto;
    }

    public double getVlProduto() {
        return vlProduto;
    }

    public void setVlProduto(double vlProduto) {
        this.vlProduto = vlProduto;
    }

    public Empresa getEmpresa() {
        return empresa;
    }

    public void setEmpresa(Empresa empresa) {
        this.empresa = empresa;
    }
}
