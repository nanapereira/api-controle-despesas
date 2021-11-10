package com.controle_despesa;

import com.controle_despesa.controller.CategoriaController;
import com.controle_despesa.controller.ProdutoController;
import com.controle_despesa.entity.Categoria;
import com.controle_despesa.entity.Produto;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.time.LocalDate;

@SpringBootApplication
public class ApiControleDespesaApplication implements CommandLineRunner {

    @Autowired
    CategoriaController categoriaController;

	@Autowired
	ProdutoController produtoController;

    public static void main(String[] args) {
        SpringApplication.run(ApiControleDespesaApplication.class, args);
    }

    @Override
    public void run(String... args) throws Exception {

        Categoria categoria01 = new Categoria(null, "Livros", LocalDate.now());
        Categoria categoria02 = new Categoria(null, "Eletronicos", LocalDate.now());
        Categoria categoria03 = new Categoria(null, "Horfruit", LocalDate.now());
        Categoria categoria04 = new Categoria(null, "Bebidas", LocalDate.now());
        Categoria categoria05 = new Categoria(null, "Comidas", LocalDate.now());

        categoriaController.salvar(categoria01);
        categoriaController.salvar(categoria02);
        categoriaController.salvar(categoria03);
        categoriaController.salvar(categoria04);
        categoriaController.salvar(categoria05);

        Produto produto01 = new Produto(null, "Pequeno Principe",
                "un", 34.90, true);

        Produto produto02 = new Produto(null, "TV",
                "un", 1500.55, true);

        Produto produto03 = new Produto(null, "Batata",
                "kg", 2.25, true);

        Produto produto04 = new Produto(null, "Tomate",
                "kg", 3.78, true);

		produtoController.salvar(produto01);
        produtoController.salvar(produto02);
        produtoController.salvar(produto03);
        produtoController.salvar(produto04);


    }
}
