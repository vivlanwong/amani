package com.amani.model;



/**
 * PapercardId generated by MyEclipse - Hibernate Tools
 */

public class UseroverallId  implements java.io.Serializable {


    // Fields    

     private String userno;
     private String modetype;
 	private String modevalue;

    // Constructors

    /** default constructor */
    public UseroverallId() {
    }

    
    /** full constructor */
    public UseroverallId(String userno, String modetype,String modevalue) {
        this.userno = userno;
        this.modetype = modetype;
        this.modevalue= modevalue;
    }


	public String getUserno() {
		return userno;
	}


	public void setUserno(String userno) {
		this.userno = userno;
	}


	public String getModetype() {
		return modetype;
	}


	public void setModetype(String modetype) {
		this.modetype = modetype;
	}


	public String getModevalue() {
		return modevalue;
	}


	public void setModevalue(String modevalue) {
		this.modevalue = modevalue;
	}

   

}