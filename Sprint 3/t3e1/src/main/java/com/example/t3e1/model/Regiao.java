
package com.example.t3e1.model;


public enum Regiao {

    Norte ("Norte"),
    Nordeste ("Nordeste"), 
    Sul ("Sul"),
    Sudeste ("Sudeste"),
    CentroOeste ("Centro Oeste");
      
    private String nome;

    private Regiao(String nome) {
        this.nome = nome;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
    
    
    
}
