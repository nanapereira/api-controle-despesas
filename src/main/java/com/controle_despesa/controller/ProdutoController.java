package com.controle_despesa.controller;

import com.controle_despesa.dto.ProdutoDTO;
import com.controle_despesa.entity.Produto;
import com.controle_despesa.repositories.ProdutoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

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

    @GetMapping("/{id}")
    public Produto getById(@PathVariable Long id) {
        return produtoRepository.findById(id).get();
    }

    @PostMapping
    public void salvar(@RequestBody Produto produto) {
        produtoRepository.save(produto);
    }

    @DeleteMapping("/{id}")
    public void excluir(@PathVariable Long id) {
        produtoRepository.deleteById(id);
    }

    @PutMapping("/{id}")
    public void atualiza(@PathVariable Long id, @RequestBody Produto produto) {
        Produto produtoRetornado = produtoRepository.getOne(id);
        produtoRetornado.setValorUnitario(produto.getValorUnitario());
        produtoRepository.save(produtoRetornado);
    }

}
