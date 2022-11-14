package com.example.t3e1.controller.form;

import com.example.t3e1.model.Regiao;
import com.example.t3e1.model.State;
import com.example.t3e1.repository.StateRepository;
import com.sun.istack.NotNull;

import javax.persistence.EnumType;
import javax.persistence.Enumerated;

public class StateForm {

    @NotNull
    Long id;
    @NotNull
    String nome;
    @NotNull
    @Enumerated(EnumType.STRING)
    Regiao regiao;
    @NotNull
    Long populacao;
    @NotNull
    String capital;
    @NotNull
    Long area;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Regiao getRegiao() {
        return regiao;
    }

    public void setRegiao(Regiao regiao) {
        this.regiao = regiao;
    }

    public Long getPopulacao() {
        return populacao;
    }

    public void setPopulacao(Long populacao) {
        this.populacao = populacao;
    }

    public String getCapital() {
        return capital;
    }

    public void setCapital(String capital) {
        this.capital = capital;
    }

    public Long getArea() {
        return area;
    }

    public void setArea(Long area) {
        this.area = area;
    }

    public State converter(StateRepository stateRepository) {
       return new State(id, nome, regiao, populacao, capital, area);
    }

    public State atualizar(Long id, StateRepository stateRepository) {
      State state = stateRepository.getOne(id);
      
      state.setNome(this.nome);
      state.setRegiao(this.regiao);
      state.setPopulacao(this.populacao);
      state.setCapital(this.capital);
      state.setArea(this.area);
      
      return state;
    }
    
    
    

}
