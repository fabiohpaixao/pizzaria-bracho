package br.com.pizzariatreze.controller;

import br.com.pizzariatreze.model.Produto;
import java.util.Map;
import java.util.TreeMap;

public class ProdutoController {

    public boolean save(Map mapProduto) throws Exception {
        Produto produto = new Produto();
        return produto.save(mapProduto);
    }
    
    public Integer savePizza(String nome, String composicao){
        Produto produto = new Produto();
        return produto.savePizza(nome, composicao);
    }
    
}
