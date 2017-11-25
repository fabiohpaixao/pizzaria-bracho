package br.com.pizzariatreze.dto;

public class GerenteDTO extends FuncionarioDTO{
    
    public GerenteDTO(){
    }

    public GerenteDTO(int id, String nome, String endereco, String telefone, String cpf, double salario){
        super(id,nome,endereco,telefone,cpf,salario,"Gerente");
    }
}
