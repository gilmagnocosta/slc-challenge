package br.com.gilmagno.slcchallenge.entities;

import java.util.Date;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import com.thoughtworks.xstream.annotations.XStreamAlias;

@Entity
@Table(name = "Slc001")
public class Slc0001Entity {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;

	@XStreamAlias("CodMsg")
	private String codMsg;

	@XStreamAlias("NumCtrlSLC")
	private String numCtrlSlc;
	
	@XStreamAlias("ISPBIF")
	private String IspBif;
	
	@XStreamAlias("TpInf")
	private String tpInf;
	
	@OneToOne(cascade = CascadeType.ALL)
	@XStreamAlias("Grupo_SLC0001_Liquid")
	private GrupoSlc0001LiquidEntity grupo_SLC0001_Liquid;
	
	@XStreamAlias("DtHrSLC")
	private Date dtHrSLC;
	
	@XStreamAlias("DtMovto")
	private Date dtMovto;
	
	public String getCodMsg() {
		return codMsg;
	}
	public void setCodMsg(String codMsg) {
		this.codMsg = codMsg;
	}
	public String getNumCtrlSlc() {
		return numCtrlSlc;
	}
	public void setNumCtrlSlc(String numCtrlSlc) {
		this.numCtrlSlc = numCtrlSlc;
	}
	public String getIspBif() {
		return IspBif;
	}
	public void setIspBif(String ispBif) {
		IspBif = ispBif;
	}
	public String getTpInf() {
		return tpInf;
	}
	public void setTpInf(String tpInf) {
		this.tpInf = tpInf;
	}
	public GrupoSlc0001LiquidEntity getGrupo_SLC0001_Liquid() {
		return grupo_SLC0001_Liquid;
	}
	public void setGrupo_SLC0001_Liquid(GrupoSlc0001LiquidEntity grupo_SLC0001_Liquid) {
		this.grupo_SLC0001_Liquid = grupo_SLC0001_Liquid;
	}
	public Date getDtHrSLC() {
		return dtHrSLC;
	}
	public void setDtHrSLC(Date dtHrSLC) {
		this.dtHrSLC = dtHrSLC;
	}
	public Date getDtMovto() {
		return dtMovto;
	}
	public void setDtMovto(Date dtMovto) {
		this.dtMovto = dtMovto;
	}
	
	

}
