package br.com.gilmagno.slcchallenge.entities;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import com.thoughtworks.xstream.annotations.XStreamAlias;

@Entity
@Table(name = "Slc")
@XStreamAlias("DOC")
public class SlcEntity {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	
	@OneToOne(cascade = CascadeType.ALL)
	@XStreamAlias("BCMSG")
	private BcMsgEntity bcMsg;
	
	@OneToOne(cascade = CascadeType.ALL)
	@XStreamAlias("SISMSG")
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
