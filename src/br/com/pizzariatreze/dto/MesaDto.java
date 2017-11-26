package br.com.pizzariatreze.dto;

import java.util.ArrayList;

public class MesaDto {
    private int id;
    private int numero;
    private int qtdLugares;
    private ArrayList<Integer> codReserva = new ArrayList<Integer>();
    
    public MesaDto() {
    }
    
    public MesaDto(int id, int numero, int qtdLugares, ArrayList<Integer> codReserva) {
        this.setId(id);
        this.setNumero(numero);
        this.setQtdLugares(qtdLugares);
        
        for(int i = 0; i < codReserva.size(); i++) {
            this.setCodReserva(codReserva.get(i));
        }
    }

    public ArrayList<Integer> getCodReserva() {
        return codReserva;
    }

    public void setCodReserva(int codReserva) {
        this.codReserva.add(codReserva);
    }
    
    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getQtdLugares() {
        return qtdLugares;
    }

    public void setQtdLugares(int qtdLugares) {
        this.qtdLugares = qtdLugares;
    }
        
}