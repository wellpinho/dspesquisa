package br.com.wellpinho.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.wellpinho.entities.Record;

public interface RecordRepository extends JpaRepository<Record, Long> {

}
