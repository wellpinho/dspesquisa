package br.com.wellpinho.services;

import java.time.Instant;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import br.com.wellpinho.dto.RecordDto;
import br.com.wellpinho.dto.RecordInsertDto;
import br.com.wellpinho.entities.Game;
import br.com.wellpinho.entities.Record;
import br.com.wellpinho.repositories.GameRepository;
import br.com.wellpinho.repositories.RecordRepository;

@Service
public class RecordService {
	
	@Autowired
	private RecordRepository repository;
	
	@Autowired
	private  GameRepository gameRepository;
	
	@Transactional
	public RecordDto insert(RecordInsertDto dto) {
		
		Record entity = new Record();
		 
		entity.setName(dto.getName());
		entity.setAge(dto.getAge());
		entity.setMoment(Instant.now());
		
		Game game = gameRepository.getOne(dto.getGameId());
		entity.setGame(game);
		
		entity = repository.save(entity);
		return new RecordDto(entity);
	}

	@Transactional(readOnly = true)
	public Page<RecordDto> findByMoments(Instant minDate, Instant maxDate, PageRequest pageRequest) {
		return repository.findByMoments(minDate, maxDate, pageRequest).map(x -> new RecordDto(x));
	}
	
}
