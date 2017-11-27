/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.pizzariatreze.controller;

import br.com.pizzariatreze.model.Produto;
import java.util.Map;

/**
 *
 * @author Fabio
 */
public class ProdutoController {

        public boolean save(Map mapProduto) {
        Produto produto = new Produto();
        return produto.save(mapProduto);
    }
    
}
