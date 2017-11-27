/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.pizzariatreze.controller;

import br.com.pizzariatreze.model.Funcionario;
import java.util.List;
import java.util.Map;

/**
 *
 * @author Fabio
 */
public class FuncionarioController {

    public List<Object> listar(int id) {
        Funcionario funcionario = new Funcionario();
        return funcionario.listar(id);
    }
    
    public List<Object> listar() {
        Funcionario funcionario = new Funcionario();
        return funcionario.listar();
    } 

        public boolean save(Map mapFuncionario) {
        Funcionario funcionario = new Funcionario();
        return funcionario.save(mapFuncionario);
    }
    
}
