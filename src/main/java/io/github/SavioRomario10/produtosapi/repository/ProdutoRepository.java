package io.github.SavioRomario10.produtosapi.repository;

import io.github.SavioRomario10.produtosapi.model.Produto;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface ProdutoRepository extends JpaRepository<Produto, String> {

  List<Produto> findByNome(String nome);
}