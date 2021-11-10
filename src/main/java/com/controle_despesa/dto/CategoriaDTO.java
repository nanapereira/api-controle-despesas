package com.controle_despesa.dto;

import com.controle_despesa.entity.Categoria;
import lombok.Getter;

import java.util.List;
import java.util.stream.Collectors;

@Getter
public class CategoriaDTO {

    // Não utilizar tipos complexos.
    private String descricao;

    public CategoriaDTO(Categoria categoria){
        this.descricao = categoria.getDescricao();
    }

    // Método que converte a entidade para DTO
    public static List<CategoriaDTO> converter(List<Categoria> categorias){
        return categorias.stream().map(CategoriaDTO::new).collect(Collectors.toList());
    }
}
