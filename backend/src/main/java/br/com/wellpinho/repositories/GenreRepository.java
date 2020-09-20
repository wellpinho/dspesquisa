package br.com.wellpinho.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.wellpinho.entities.Genre;

public interface GenreRepository extends JpaRepository<Genre, Long> {

}
