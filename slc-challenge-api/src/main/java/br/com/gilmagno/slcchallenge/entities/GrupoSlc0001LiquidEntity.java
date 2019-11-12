package br.com.gilmagno.slcchallenge.entities;

import java.util.Date;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonProperty;

@Entity
@Table(name = "GrupoSlc0001Liquid")
public class GrupoSlc0001LiquidEntity {
	
	@Id
	private Long id;
	
	@JsonProperty("DtLiquid")
	private Date dtLiquid;
	
	@JsonProperty("NumSeqCicloLiquid")
	private String numSeqCicloLiquid;
	
	//@OneToMany(targetEntity = GrupoSlc0001ProdtEntity.class)
	@OneToOne
	@JsonProperty("Grupo_SLC0001_Prodt")
	private GrupoSlc0001ProdtEntity grupo_SLC0001_Prodt1;
	@OneToOne
	@JsonProperty("Grupo_SLC0001_Prodt")
	private GrupoSlc0001ProdtEntity grupo_SLC0001_Prodt2;
	@OneToOne
	@JsonProperty("Grupo_SLC0001_Prodt")
	private GrupoSlc0001ProdtEntity grupo_SLC0001_Prodt3;
	@OneToOne
	@JsonProperty("Grupo_SLC0001_Prodt")
	private GrupoSlc0001ProdtEntity grupo_SLC0001_Prodt4;
	
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
	public GrupoSlc0001ProdtEntity getGrupo_SLC0001_Prodt1() {
		return grupo_SLC0001_Prodt1;
	}
	public void setGrupo_SLC0001_Prodt1(GrupoSlc0001ProdtEntity grupo_SLC0001_Prodt1) {
		this.grupo_SLC0001_Prodt1 = grupo_SLC0001_Prodt1;
	}
	public GrupoSlc0001ProdtEntity getGrupo_SLC0001_Prodt2() {
		return grupo_SLC0001_Prodt2;
	}
	public void setGrupo_SLC0001_Prodt2(GrupoSlc0001ProdtEntity grupo_SLC0001_Prodt2) {
		this.grupo_SLC0001_Prodt2 = grupo_SLC0001_Prodt2;
	}
	public GrupoSlc0001ProdtEntity getGrupo_SLC0001_Prodt3() {
		return grupo_SLC0001_Prodt3;
	}
	public void setGrupo_SLC0001_Prodt3(GrupoSlc0001ProdtEntity grupo_SLC0001_Prodt3) {
		this.grupo_SLC0001_Prodt3 = grupo_SLC0001_Prodt3;
	}
	public GrupoSlc0001ProdtEntity getGrupo_SLC0001_Prodt4() {
		return grupo_SLC0001_Prodt4;
	}
	public void setGrupo_SLC0001_Prodt4(GrupoSlc0001ProdtEntity grupo_SLC0001_Prodt4) {
		this.grupo_SLC0001_Prodt4 = grupo_SLC0001_Prodt4;
	}
	
	
}
