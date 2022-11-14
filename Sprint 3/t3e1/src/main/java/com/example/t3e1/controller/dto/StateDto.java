
package com.example.t3e1.controller.dto;

import com.example.t3e1.model.Regiao;
import com.example.t3e1.model.State;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import org.springframework.beans.BeanUtils;


public class StateDto {

    Long id;
    String nome;
    Regiao regiao;
    Long populacao;
    String capital;
    Long area;

    public StateDto(State state) {
        this.id = state.getId();
        this.nome = state.getNome();
        this.regiao = state.getRegiao();
        this.populacao = state.getPopulacao();
        this.capital = state.getCapital();
        this.area = state.getArea();
    }

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
    
    
public static List<StateDto> converter(List<State> states) {
 return states.stream().map(StateDto::new).collect(Collectors.toList());
        
}



    
}
