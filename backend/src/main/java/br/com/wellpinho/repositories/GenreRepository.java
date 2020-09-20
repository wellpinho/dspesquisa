package br.com.wellpinho.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import br.com.wellpinho.entities.Genre;

@Repository
public interface GenreRepository extends JpaRepository<Genre, Long> {

}
