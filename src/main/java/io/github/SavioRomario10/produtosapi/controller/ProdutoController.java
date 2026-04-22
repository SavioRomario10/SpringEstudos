package io.github.SavioRomario10.produtosapi.controller;

import io.github.SavioRomario10.produtosapi.model.Produto;
import io.github.SavioRomario10.produtosapi.repository.ProdutoRepository;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.UUID;

import org.springframework.web.bind.annotation.PostMapping;


@RestController
@RequestMapping("/produtos")
public class ProdutoController {

  private ProdutoRepository produtoRepository;

  public ProdutoController(ProdutoRepository produtoRepository) {
    this.produtoRepository = produtoRepository;
  }

  @PostMapping
  public Produto salvar(@RequestBody Produto produto) {
    System.out.println("Salvando produto: " + produto);

    var id = UUID.randomUUID().toString();
    produto.setId(id);

    produtoRepository.save(produto);
    
    return produto;
  }
}
