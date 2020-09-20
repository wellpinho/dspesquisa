package br.com.wellpinho.resources;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.wellpinho.dto.RecordDto;
import br.com.wellpinho.dto.RecordInsertDto;
import br.com.wellpinho.services.RecordService;

@RestController
@RequestMapping(value = "/records")
public class RecordResource {
	
	@Autowired
	private RecordService service;
	
	@PostMapping
	public ResponseEntity<RecordDto> insert(@RequestBody RecordInsertDto dto) {
		RecordDto newDto = service.insert(dto);
		return ResponseEntity.ok().body(newDto);
	}

}