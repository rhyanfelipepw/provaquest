package com.prova0707.demo.controller;

import com.prova0707.demo.model.Empresa;
import com.prova0707.demo.repository.RepositoryEmpresa;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Optional;


@RestController
public class ControllerEmpresa {

    @Autowired
    private RepositoryEmpresa repository;

    @PostMapping(path = "/cadastra")
    public Empresa cadastraEmpresa(Empresa empresa){
        return repository.save(empresa);
    }
    public Optional<Empresa> getProdutosEmpresa(@PathVariable("idEmpresa") Integer id){
       return repository.findById(id);
    }
}
