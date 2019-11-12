package br.com.gilmagno.slcchallenge.entities;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonProperty;

@Entity
@Table(name = "GrupoSlc0001Prodt")
public class GrupoSlc0001ProdtEntity {
	
	@Id
	private Long id;
	
	@JsonProperty("CodProdt")
	private String codProdt;
	
	@OneToOne
	@JsonProperty("Grupo_SLC0001_LiquidProdt")
	private GrupoSlc0001LiquidProdtEntity grupo_SLC0001_LiquidProdt;
	
	public String getCodProdt() {
		return codProdt;
	}
	public void setCodProdt(String codProdt) {
		this.codProdt = codProdt;
	}
	public GrupoSlc0001LiquidProdtEntity getGrupo_SLC0001_LiquidProdt() {
		return grupo_SLC0001_LiquidProdt;
	}
	public void setGrupo_SLC0001_LiquidProdt(GrupoSlc0001LiquidProdtEntity grupo_SLC0001_LiquidProdt) {
		this.grupo_SLC0001_LiquidProdt = grupo_SLC0001_LiquidProdt;
	}
	
	
	
}
