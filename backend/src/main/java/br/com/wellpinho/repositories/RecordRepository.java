package br.com.wellpinho.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import br.com.wellpinho.entities.Record;

@Repository
public interface RecordRepository extends JpaRepository<Record, Long> {

}
