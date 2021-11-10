package com.controle_despesa.controller;

import com.controle_despesa.model.dto.CategoriaDTO;
import com.controle_despesa.model.entity.Categoria;
import com.controle_despesa.model.repositories.CategoriaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/categoria")
public class CategoriaController {

    @Autowired
    private CategoriaRepository categoriaRepository;

    @GetMapping
    public List<CategoriaDTO> listaTudo() {
        List<Categoria> categorias = categoriaRepository.findAll();
        return CategoriaDTO.converter(categorias);
    }

    @GetMapping("/{id}")
    public Categoria getById(@PathVariable Long id) {
        return categoriaRepository.findById(id).get();
    }

    @PostMapping
    public void salvar(@RequestBody Categoria categoria) {
        categoriaRepository.save(categoria);
    }

    @DeleteMapping("/{id}")
    public void excluir(@PathVariable Long id) {
        categoriaRepository.deleteById(id);
    }

    @PutMapping("/{id}")
    public void atualiza(@PathVariable Long id, @RequestBody Categoria categoria) {
        Categoria categoriaRetornada = categoriaRepository.getOne(id);
        categoriaRetornada.setDataCadastro(categoria.getDataCadastro());
        categoriaRepository.save(categoriaRetornada);
    }
}
