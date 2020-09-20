package br.com.wellpinho.services;

import java.util.List;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import br.com.wellpinho.dto.GameDto;
import br.com.wellpinho.entities.Game;
import br.com.wellpinho.repositories.GameRepository;

@Service
public class GameService {
	
	@Autowired
	private GameRepository repository;
	
	@Transactional(readOnly = true)
	public List<GameDto> findAll() {
		List<Game> list = repository.findAll();
		return list.stream().map(x -> new GameDto(x)).collect(Collectors.toList());
	}
}
