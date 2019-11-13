package br.com.gilmagno.slcchallenge.entities;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import com.thoughtworks.xstream.annotations.XStreamAlias;

@Entity
@Table(name = "GrupoSeq")
public class GrupoSeqEntity {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	
	@XStreamAlias("NumSeq")
	private Integer numSeq;
	
	@XStreamAlias("IndrCont")
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
