package com.produtos.apirest.repository;

// biblioteca que tem as funções de CRUD
import org.springframework.data.jpa.repository.JpaRepository;

import com.produtos.apirest.models.Produto;


public interface ProdutoRepository extends JpaRepository<Produto, Long> {

	Produto findById(long id);
	
}
