package br.com.wellpinho.dto;

import java.io.Serializable;
import java.time.Instant;

import br.com.wellpinho.entities.Record;
import br.com.wellpinho.entities.enuns.Platform;

public class RecordDto implements Serializable {
	private static final long serialVersionUID = 1L;
	private Long id;
	private Instant moment;
	private String name;
	private Integer age;
	private String gameTitle;
	private Platform gamePlatform;
	private String ganreName;
	
	public RecordDto() {}
	
	public RecordDto(Record entity) {
		id = entity.getId();
		moment = entity.getMoment();
		name = entity.getName();
		age = entity.getAge();
		gameTitle = entity.getGame().getTitle();
		gamePlatform = entity.getGame().getPlatform();
		ganreName = entity.getGame().getGenre().getName();
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public Instant getMoment() {
		return moment;
	}

	public void setMoment(Instant moment) {
		this.moment = moment;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Integer getAge() {
		return age;
	}

	public void setAge(Integer age) {
		this.age = age;
	}

	public String getGameTitle() {
		return gameTitle;
	}

	public void setGameTitle(String gameTitle) {
		this.gameTitle = gameTitle;
	}

	public Platform getGamePlatform() {
		return gamePlatform;
	}

	public void setGamePlatform(Platform gamePlatform) {
		this.gamePlatform = gamePlatform;
	}

	public String getGanreName() {
		return ganreName;
	}

	public void setGanreName(String ganreName) {
		this.ganreName = ganreName;
	}
}
