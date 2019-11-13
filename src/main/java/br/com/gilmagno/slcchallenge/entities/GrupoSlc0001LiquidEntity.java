package br.com.gilmagno.slcchallenge.entities;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import com.thoughtworks.xstream.annotations.XStreamAlias;

@Entity
@Table(name = "GrupoSlc0001Liquid")
@XStreamAlias("Grupo_SLC0001_Liquid")
public class GrupoSlc0001LiquidEntity {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	
	@Column
	@XStreamAlias("DtLiquid")
	private Date dtLiquid;
	
	@Column
	@XStreamAlias("NumSeqCicloLiquid")
	private String numSeqCicloLiquid;
	
	public Date getDtLiquid() {
		return dtLiquid;
	}
	public void setDtLiquid(Date dtLiquid) {
		this.dtLiquid = dtLiquid;
	}
	public String getNumSeqCicloLiquid() {
		return numSeqCicloLiquid;
	}
	public void setNumSeqCicloLiquid(String numSeqCicloLiquid) {
		this.numSeqCicloLiquid = numSeqCicloLiquid;
	}
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	
	
	
}
