package br.com.wellpinho.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import br.com.wellpinho.entities.Game;

@Repository
public interface GameRepository extends JpaRepository<Game, Long> {

}
