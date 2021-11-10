package com.controle_despesa.controller;

import com.controle_despesa.model.service.ProdutoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PatchMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/produto")
public class ProdutoController {

    @Autowired
    private ProdutoService service;

    @PatchMapping("/{id}")
    public void inativar(@PathVariable Long id) {
        service.inativar(id);
    }
}
