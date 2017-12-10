/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.pizzariatreze.controller;

import br.com.pizzariatreze.model.Reserva;
import java.util.List;

/**
 *
 * @author Fabio
 */
public class ReservaController {

    public void reservar(String nome, List<Integer> ids) {
        Reserva reserva = new Reserva();
        
        reserva.reservar(nome, ids);
    }
    
}
