package br.com.pizzariatreze.controller;

import br.com.pizzariatreze.model.Produto;
import java.util.List;
import java.util.Map;

public class ProdutoController {

    public boolean save(Map mapProduto) {
        Produto produto = new Produto();
        return produto.save(mapProduto);
    }
    
    public Integer savePizza(String nome, List ids){
        Produto produto = new Produto();
        return produto.savePizza(nome, ids);
    }
    
}
