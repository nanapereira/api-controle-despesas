package com.controle_despesa.controller;

import com.controle_despesa.dto.ProdutoDTO;
import com.controle_despesa.entity.Produto;
import com.controle_despesa.repositories.ProdutoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/produto")
public class ProdutoController {

    @Autowired
    private ProdutoRepository produtoRepository;

    @GetMapping
    public List<ProdutoDTO> listaTudo() {
        List<Produto> produtos = produtoRepository.findAll();
        return ProdutoDTO.converter(produtos);
    }

}
