package br.com.gilmagno.slcchallenge.entities;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonProperty;

@Entity
@Table(name = "GrupoSeq")
public class GrupoSeqEntity {
	
	@Id
	private Long id;
	
	@JsonProperty("NumSeq")
	private Integer numSeq;
	
	@JsonProperty("IndrCont")
	private String indrCont;
	
	public Integer getNumSeq() {
		return numSeq;
	}
	public void setNumSeq(Integer numSeq) {
		this.numSeq = numSeq;
	}
	public String getIndrCont() {
		return indrCont;
	}
	public void setIndrCont(String indrCont) {
		this.indrCont = indrCont;
	}
	
	
}
