package br.com.gilmagno.slcchallenge.entities;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonProperty;

@Entity
@Table(name = "SisMsg")
public class SisMsgEntity {
	
	@Id
	private Long id;
	
	@OneToOne
	@JsonProperty("SLC0001")
	private Slc0001Entity slc0001;
	
	public Slc0001Entity getSlc001() {
		return slc0001;
	}
	
	public void setSlc001(Slc0001Entity slc001) {
		this.slc0001 = slc001;
	}

}
