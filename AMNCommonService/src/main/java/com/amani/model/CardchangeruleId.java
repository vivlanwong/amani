package com.amani.model;

import java.math.BigDecimal;



/**
 * PapercardId generated by MyEclipse - Hibernate Tools
 */

public class CardchangeruleId  implements java.io.Serializable {


    // Fields    

     private String rulemodeid;
     private String cardtypeno;
     private double seqno; 
     
     public CardchangeruleId(String rulemodeid, String cardtypeno,double seqno ) {
         this.rulemodeid = rulemodeid;
         this.cardtypeno = cardtypeno;
         this.seqno = seqno;
     }
     public CardchangeruleId() {
     }
	public String getRulemodeid() {
		return rulemodeid;
	}
	public void setRulemodeid(String rulemodeid) {
		this.rulemodeid = rulemodeid;
	}
	public String getCardtypeno() {
		return cardtypeno;
	}
	public void setCardtypeno(String cardtypeno) {
		this.cardtypeno = cardtypeno;
	}
	public double getSeqno() {
		return seqno;
	}
	public void setSeqno(double seqno) {
		this.seqno = seqno;
	}
	
	
}