package com.prova0707.demo.model;

import javax.persistence.*;
import java.io.Serializable;
import java.util.List;

@Entity
public class Empresa {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    Integer idEmpresa;
    String nmEmpresa;
    @OneToMany(mappedBy = "empresa", cascade = CascadeType.ALL)
    List<Produtos> produtos;

    public Empresa(Integer idEmpresa, String nmEmpresa, List<Produtos> produtos) {
        this.idEmpresa = idEmpresa;
        this.nmEmpresa = nmEmpresa;
        this.produtos = produtos;
    }

    public Integer getIdEmpresa() {
        return idEmpresa;
    }

    public void setIdEmpresa(Integer idEmpresa) {
        this.idEmpresa = idEmpresa;
    }

    public String getNmEmpresa() {
        return nmEmpresa;
    }

    public void setNmEmpresa(String nmEmpresa) {
        this.nmEmpresa = nmEmpresa;
    }

    public List<Produtos> getProdutos() {
        return produtos;
    }

    public void setProdutos(List<Produtos> produtos) {
        this.produtos = produtos;
    }
}
