package com.amani.model;


/**
 * Fex06Id generated by MyEclipse - Hibernate Tools
 */

public class DnointernalcardinfoId  implements java.io.Serializable {


    // Fields    

     private String cardvesting;//公司编号
     private String cardno;//抵用券
     private Double seqno;//序号


    // Constructors

    /** default constructor */
    public DnointernalcardinfoId() {
    }

    
    /** full constructor */
    public DnointernalcardinfoId(String cardvesting, String cardno, Double seqno) {
        this.cardvesting = cardvesting;
        this.cardno = cardno;
        this.seqno = seqno;
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


	public Double getSeqno() {
		return seqno;
	}


	public void setSeqno(Double seqno) {
		this.seqno = seqno;
	}




}