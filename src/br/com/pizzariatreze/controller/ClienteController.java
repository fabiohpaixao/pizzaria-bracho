/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.pizzariatreze.controller;

import br.com.pizzariatreze.model.*;
import java.util.Map;

/**
 *
 * @author Fabio
 */
public class ClienteController {

    public String save(Map mapCliente) {
        Cliente cliente = new Cliente();
        return cliente.save(mapCliente);
    }
    
}
