/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.pizzariatreze.controller;

import br.com.pizzariatreze.model.Ingrediente;
import java.util.Map;

/**
 *
 * @author Fabio
 */
public class IngredienteController {

        public boolean save(Map mapIngrediente) {
        Ingrediente ingrediente = new Ingrediente();
        return ingrediente.save(mapIngrediente);
    }
    
}
