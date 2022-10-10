package com.lojagames.games.repository;

import java.math.BigDecimal;
import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.lojagames.games.model.Produto;

@Repository
public interface ProdutoRepository extends JpaRepository<Produto,Long>{
	
	public List <Produto> findAllByNomeContainingIgnoreCase(@Param("nome")String nome);
	
	public List <Produto> findByPrecoGreaterThanOrderByPreco(BigDecimal preco); //filtra do maior preço para o menor

	public List <Produto> findByPrecoLessThanOrderByPrecoDesc(BigDecimal preco); //filtra do menor preço para o maior
}
