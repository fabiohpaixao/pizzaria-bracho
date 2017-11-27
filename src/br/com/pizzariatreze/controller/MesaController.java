/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.pizzariatreze.controller;

import br.com.pizzariatreze.model.Mesa;
import java.util.List;

/**
 *
 * @author Fabio
 */
public class MesaController {

    public List<Object> listar(int numero) {
        Mesa mesa = new Mesa();
        return mesa.listar(numero);
    }
    
    public List<Object> listar() {
        Mesa mesa = new Mesa();
        return mesa.listar();
    } 
    
}
