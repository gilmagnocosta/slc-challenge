package br.com.gilmagno.slcchallenge.entities;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonProperty;

@Entity
@Table(name = "GrupoSlc0001LiquidProdt")
public class GrupoSlc0001LiquidProdtEntity {
	
	@Id
	private Long id;
	
	@JsonProperty("IdentLinhaBilat")
    private String identdLinhaBilat;
	
	@JsonProperty("TpDeb_Cred")
    private String tpDeb_Cred;
	
	@JsonProperty("ISPBIFCredtd")
    private String iSPBIFCredtd;
	
	@JsonProperty("ISPBIFDebtd")
    private String iSPBIFDebtd;
	
	@JsonProperty("VlrLanc")
    private double vlrLanc;
	
	@JsonProperty("CNPJNLiqdantDebtd")
    private String cNPJNLiqdantDebtd;
	
	@JsonProperty("NomCliDebtd")
    private String nomCliDebtd;
    
    @JsonProperty("CNPJNLiqdantCredtd")
    private String cNPJNLiqdantCredtd;
    
    @JsonProperty("NomCliCredtd")
    private String nomCliCredtd;
    
    @JsonProperty("TpTranscSLC")
    private String tpTranscSLC;
	
    public String getIdentdLinhaBilat() {
		return identdLinhaBilat;
	}
	public void setIdentdLinhaBilat(String identdLinhaBilat) {
		this.identdLinhaBilat = identdLinhaBilat;
	}
	public String getTpDeb_Cred() {
		return tpDeb_Cred;
	}
	public void setTpDeb_Cred(String tpDeb_Cred) {
		this.tpDeb_Cred = tpDeb_Cred;
	}
	public String getiSPBIFCredtd() {
		return iSPBIFCredtd;
	}
	public void setiSPBIFCredtd(String iSPBIFCredtd) {
		this.iSPBIFCredtd = iSPBIFCredtd;
	}
	public String getiSPBIFDebtd() {
		return iSPBIFDebtd;
	}
	public void setiSPBIFDebtd(String iSPBIFDebtd) {
		this.iSPBIFDebtd = iSPBIFDebtd;
	}
	public double getVlrLanc() {
		return vlrLanc;
	}
	public void setVlrLanc(double vlrLanc) {
		this.vlrLanc = vlrLanc;
	}
	public String getcNPJNLiqdantDebtd() {
		return cNPJNLiqdantDebtd;
	}
	public void setcNPJNLiqdantDebtd(String cNPJNLiqdantDebtd) {
		this.cNPJNLiqdantDebtd = cNPJNLiqdantDebtd;
	}
	public String getNomCliDebtd() {
		return nomCliDebtd;
	}
	public void setNomCliDebtd(String nomCliDebtd) {
		this.nomCliDebtd = nomCliDebtd;
	}
	public String getcNPJNLiqdantCredtd() {
		return cNPJNLiqdantCredtd;
	}
	public void setcNPJNLiqdantCredtd(String cNPJNLiqdantCredtd) {
		this.cNPJNLiqdantCredtd = cNPJNLiqdantCredtd;
	}
	public String getNomCliCredtd() {
		return nomCliCredtd;
	}
	public void setNomCliCredtd(String nomCliCredtd) {
		this.nomCliCredtd = nomCliCredtd;
	}
	public String getTpTranscSLC() {
		return tpTranscSLC;
	}
	public void setTpTranscSLC(String tpTranscSLC) {
		this.tpTranscSLC = tpTranscSLC;
	}
    
    
	
}
