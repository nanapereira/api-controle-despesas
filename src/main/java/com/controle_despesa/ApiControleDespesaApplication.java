package com.controle_despesa;

import com.controle_despesa.controller.CategoriaController;
import com.controle_despesa.entity.Categoria;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class ApiControleDespesaApplication implements CommandLineRunner {

	@Autowired
	CategoriaController categoriaController;

	public static void main(String[] args) {
			SpringApplication.run(ApiControleDespesaApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		Categoria categoria01 = new Categoria(null, "Livros", "09/11/2021");
		Categoria categoria02 = new Categoria(null, "Eletronicos", "10/11/2021");
		Categoria categoria03 = new Categoria(null, "Horfruit", "11/11/2021");
		Categoria categoria04 = new Categoria(null, "Bebidas", "12/11/2021");
		Categoria categoria05 = new Categoria(null, "Comidas", "13/11/2021");

		categoriaController.salvar(categoria01);
		categoriaController.salvar(categoria02);
		categoriaController.salvar(categoria03);
		categoriaController.salvar(categoria04);
		categoriaController.salvar(categoria05);
	}
}
