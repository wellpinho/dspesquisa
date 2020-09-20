package br.com.wellpinho.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.wellpinho.entities.Game;

public interface GameRepository extends JpaRepository<Game, Long> {

}
