package com.amani.model;



/**
 * PapercardId generated by MyEclipse - Hibernate Tools
 */

public class GoodsinfoId  implements java.io.Serializable {


    // Fields    

     private String goodsmodeid;//产品模板
     private String goodsno;//产品编号
     private String goodssource;//来源
     
     public GoodsinfoId(String goodsmodeid, String goodsno ,String goodssource) {
         this.goodsmodeid = goodsmodeid;
         this.goodsno = goodsno;
         this.goodssource=goodssource;
     }
     public GoodsinfoId() {
     }
	public String getGoodsmodeid() {
		return goodsmodeid;
	}
	public void setGoodsmodeid(String goodsmodeid) {
		this.goodsmodeid = goodsmodeid;
	}
	public String getGoodsno() {
		return goodsno;
	}
	public void setGoodsno(String goodsno) {
		this.goodsno = goodsno;
	}
	public String getGoodssource() {
		return goodssource;
	}
	public void setGoodssource(String goodssource) {
		this.goodssource = goodssource;
	}
	
}