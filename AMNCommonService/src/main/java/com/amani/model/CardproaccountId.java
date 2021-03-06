package com.amani.model;

import java.math.BigDecimal;



/**
 * PapercardId generated by MyEclipse - Hibernate Tools
 */

public class CardproaccountId  implements java.io.Serializable {


    // Fields    

     private String cardvesting;//卡归属门店 
     private String cardno;//会员卡号
     private String projectno;//疗程编号
     private Double proseqno;//疗程序号
     
     public CardproaccountId(String cardvesting, String cardno,String projectno,double proseqno ) {
         this.cardvesting = cardvesting;
         this.cardno = cardno;
         this.projectno = projectno;
         this.proseqno=proseqno;
     }
     public CardproaccountId() {
     }
	public String getCardvesting() {
		return cardvesting;
	}
	public void setCardvesting(String cardvesting) {
		this.cardvesting = cardvesting;
	}
	public String getCardno() {
		return cardno;
	}
	public void setCardno(String cardno) {
		this.cardno = cardno;
	}
	public String getProjectno() {
		return projectno;
	}
	public void setProjectno(String projectno) {
		this.projectno = projectno;
	}
	public Double getProseqno() {
		return proseqno;
	}
	public void setProseqno(Double proseqno) {
		this.proseqno = proseqno;
	}
	
}