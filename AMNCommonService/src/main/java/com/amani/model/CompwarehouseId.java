package com.amani.model;



/**
 * PapercardId generated by MyEclipse - Hibernate Tools
 */

public class CompwarehouseId  implements java.io.Serializable {


    // Fields    

     private String compno;
     private String warehouseno;

     
     public CompwarehouseId(String compno, String warehouseno) {
         this.compno = compno;
         this.warehouseno = warehouseno;      
     }
     public CompwarehouseId() {
     }
	public String getCompno() {
		return compno;
	}
	public void setCompno(String compno) {
		this.compno = compno;
	}
	public String getWarehouseno() {
		return warehouseno;
	}
	public void setWarehouseno(String warehouseno) {
		this.warehouseno = warehouseno;
	}
	
}