package com.example.t3e1.controller;

import com.example.t3e1.controller.dto.StateDto;
import com.example.t3e1.controller.form.StateForm;
import com.example.t3e1.model.Regiao;
import com.example.t3e1.model.State;
import com.example.t3e1.repository.StateRepository;
import java.net.URI;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.util.UriComponentsBuilder;

@RestController
public class StateController {

    @Autowired
    private StateRepository stateRepository;


    @RequestMapping("/state/regiao/{regiao}")
    public List<StateDto> lista(@PathVariable Regiao regiao) {
        if (regiao == null) {
            List<State> states = stateRepository.findAll();
            return StateDto.converter(states);
        } else {
            List<State> states = stateRepository.findByRegiao(regiao);
            return StateDto.converter(states);
        }

    }

    @RequestMapping("/state")
    public List<StateDto> lista() {
        List<State> states = stateRepository.findAll();
        return StateDto.converter(states);

    }

    @RequestMapping("/state/population")
    public List<StateDto> listaPopulation() {

        List<State> states = stateRepository.findAllByOrderByPopulacaoDesc();
        return StateDto.converter(states);

    }

    @RequestMapping("/state/area")
    public List<StateDto> listaArea() {

        List<State> states = stateRepository.findAllByOrderByAreaAsc();
        return StateDto.converter(states);

    }

    @RequestMapping("/state/{id}")
    public StateDto lista(@PathVariable Long id) {
        State state = stateRepository.getById(id);
        return new StateDto(state);

    }

    @PostMapping("/state")
    public ResponseEntity<StateDto> cadastrar(@RequestBody StateForm form, UriComponentsBuilder uriBuilder) {
        State state = form.converter(stateRepository);
        stateRepository.save(state);

        URI uri = uriBuilder.path("/state/{id}").buildAndExpand(state.getId()).toUri();
        return ResponseEntity.created(uri).body(new StateDto(state));
    }

    @PutMapping("/state/{id}")
    public ResponseEntity<StateDto> atualizar(@PathVariable Long id, @RequestBody StateForm form) {
        State state = form.atualizar(id, stateRepository);

        return ResponseEntity.ok(new StateDto(state));
    }

    @DeleteMapping("/state/{id}")
    public ResponseEntity<?> remover(@PathVariable Long id) {
        stateRepository.deleteById(id);
        return ResponseEntity.ok().build();
    }

}
