package io.github.SavioRomario10.produtosapi.repository;

import io.github.SavioRomario10.produtosapi.model.Produto;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProdutoRepository extends JpaRepository<Produto, String> {
}