package br.com.gilmagno.slcchallenge.entities;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonProperty;

@Entity
@Table(name = "Slc")
public class SlcEntity {
	
	@Id
	private Long id;
	
	@OneToOne
	@JsonProperty("BCMSG")
	private BcMsgEntity bcMsg;
	
	@OneToOne
	@JsonProperty("SISMSG")
	private SisMsgEntity sisMsg;
	
	public BcMsgEntity getBcMsg() {
		return bcMsg;
	}
	public void setBcMsg(BcMsgEntity bcMsg) {
		this.bcMsg = bcMsg;
	}
	public SisMsgEntity getSisMsg() {
		return sisMsg;
	}
	public void setSisMsg(SisMsgEntity sisMsg) {
		this.sisMsg = sisMsg;
	}


}
