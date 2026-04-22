package io.github.SavioRomario10.produtosapi.controller;

import io.github.SavioRomario10.produtosapi.model.Produto;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.PostMapping;


@RestController
@RequestMapping("/produtos")
public class ProdutoController {
  
  @PostMapping
  public Produto salvar(@RequestBody Produto produto) {
    System.out.println("Salvando produto: " + produto);
    return produto;
  }
}
