package br.com.gilmagno.slcchallenge.entities;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import com.thoughtworks.xstream.annotations.XStreamAlias;

@Entity
@Table(name = "GrupoSlc0001LiquidProdt")
@XStreamAlias("Grupo_SLC0001_LiquidProdt")
public class GrupoSlc0001LiquidProdtEntity {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	
	@XStreamAlias("IdentdLinhaBilat")
    private String identdLinhaBilat;
	
	@XStreamAlias("TpDeb_Cred")
    private String tpDeb_Cred;
	
	@XStreamAlias("ISPBIFCredtd")
    private String iSPBIFCredtd;
	
	@XStreamAlias("ISPBIFDebtd")
    private String iSPBIFDebtd;
	
	@XStreamAlias("VlrLanc")
    private double vlrLanc;
	
	@XStreamAlias("CNPJNLiqdantDebtd")
    private String cNPJNLiqdantDebtd;
	
	@XStreamAlias("NomCliDebtd")
    private String nomCliDebtd;
    
    @XStreamAlias("CNPJNLiqdantCredtd")
    private String cNPJNLiqdantCredtd;
    
    @XStreamAlias("NomCliCredtd")
    private String nomCliCredtd;
    
    @XStreamAlias("TpTranscSLC")
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
