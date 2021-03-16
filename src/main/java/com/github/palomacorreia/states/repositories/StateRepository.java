package com.github.palomacorreia.states.repositories;

import com.github.palomacorreia.states.entities.State;
import org.springframework.data.jpa.repository.JpaRepository;

public interface StateRepository extends JpaRepository<State, Long> {
}
