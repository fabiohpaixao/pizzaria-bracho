package br.com.pizzariatreze.dto;

import br.com.pizzariatreze.dao.FuncionarioDAO;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

public class FuncionarioDTO extends PessoaDTO {

    private double salario;
    private String cargo;
    
    public FuncionarioDTO(){
    }

    public FuncionarioDTO(int id, String nome, String endereco, String telefone, String cpf, double salario, String cargo){
        super(id,nome,endereco,telefone,cpf);
        this.setSalario(salario);
        this.setCargo(cargo);
        
        alterado.add("salario");
        alterado.add("cargo");
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;

        if(!alterado.contains("salario")) alterado.add("salario");
    }

    public String getCargo() {
        return cargo;
    }

    public void setCargo(String cargo) {
        this.cargo = cargo;
        
        if(!alterado.contains("cargo")) alterado.add("cargo");
    }
}
