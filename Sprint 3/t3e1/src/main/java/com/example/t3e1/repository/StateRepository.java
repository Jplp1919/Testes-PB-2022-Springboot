
package com.example.t3e1.repository;

import com.example.t3e1.model.Regiao;
import com.example.t3e1.model.State;
import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 *
 * @author Usuário
 */
public interface StateRepository extends JpaRepository<State, Long> {

    public List<State> findByRegiao(Regiao regiao);
    
     public List<State> findAllByOrderByPopulacaoDesc();
    
     public List<State> findAllByOrderByAreaAsc();
}
