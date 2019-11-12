package br.com.gilmagno.slcchallenge.entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonProperty;

@Entity
@Table(name = "BcMsg")
public class BcMsgEntity {
	
	@Id
	private Long id;
	
	@Column
	@JsonProperty("IdentdEmissor")
	private Integer identdEmissor;
	
	@Column
	@JsonProperty("IdentdDestinatario")
	private Integer identdDestinatario;

	@OneToOne
	@JsonProperty("Grupo_Seq")
	private GrupoSeqEntity grupo_Seq;
	
	@Column
	@JsonProperty("DomSist")
	private String domSist;
	
	@Column
	@JsonProperty("NUOp")
	private String nuop;
	
	
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public Integer getIdentdEmissor() {
		return identdEmissor;
	}
	public void setIdentdEmissor(Integer identdEmissor) {
		this.identdEmissor = identdEmissor;
	}
	public Integer getIdentdDestinatario() {
		return identdDestinatario;
	}
	public void setIdentdDestinatario(Integer identdDestinatario) {
		this.identdDestinatario = identdDestinatario;
	}
	public GrupoSeqEntity getGrupo_Seq() {
		return grupo_Seq;
	}
	public void setGrupo_Seq(GrupoSeqEntity grupo_Seq) {
		this.grupo_Seq = grupo_Seq;
	}
	public String getDomSist() {
		return domSist;
	}
	public void setDomSist(String domSist) {
		this.domSist = domSist;
	}
	public String getNuop() {
		return nuop;
	}
	public void setNuop(String nuop) {
		this.nuop = nuop;
	}


}
