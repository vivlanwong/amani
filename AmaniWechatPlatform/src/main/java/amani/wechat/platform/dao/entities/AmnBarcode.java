package amani.wechat.platform.dao.entities;

// Generated 2015-6-23 2:29:39 by Hibernate Tools 4.3.1

import java.math.BigDecimal;

/**
 * AmnBarcode generated by hbm2java
 */
public class AmnBarcode implements java.io.Serializable {

	private Integer id;
	private String openid;
	private String cardid;
	private String uuid;
	private Long validate;
	private BigDecimal price;
	private boolean status;
	private int solvetime;
	private String orderid;
	private String scancode;

	public AmnBarcode() {
	}

	public AmnBarcode(boolean status, int solvetime) {
		this.status = status;
		this.solvetime = solvetime;
	}

	public AmnBarcode(String openid, String cardid, String uuid, Long validate,
			BigDecimal price, boolean status, int solvetime, String orderid,
			String scancode) {
		this.openid = openid;
		this.cardid = cardid;
		this.uuid = uuid;
		this.validate = validate;
		this.price = price;
		this.status = status;
		this.solvetime = solvetime;
		this.orderid = orderid;
		this.scancode = scancode;
	}

	public Integer getId() {
		return this.id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getOpenid() {
		return this.openid;
	}

	public void setOpenid(String openid) {
		this.openid = openid;
	}

	public String getCardid() {
		return this.cardid;
	}

	public void setCardid(String cardid) {
		this.cardid = cardid;
	}

	public String getUuid() {
		return this.uuid;
	}

	public void setUuid(String uuid) {
		this.uuid = uuid;
	}

	public Long getValidate() {
		return this.validate;
	}

	public void setValidate(Long validate) {
		this.validate = validate;
	}

	public BigDecimal getPrice() {
		return this.price;
	}

	public void setPrice(BigDecimal price) {
		this.price = price;
	}

	public boolean isStatus() {
		return this.status;
	}

	public void setStatus(boolean status) {
		this.status = status;
	}

	public int getSolvetime() {
		return this.solvetime;
	}

	public void setSolvetime(int solvetime) {
		this.solvetime = solvetime;
	}

	public String getOrderid() {
		return this.orderid;
	}

	public void setOrderid(String orderid) {
		this.orderid = orderid;
	}

	public String getScancode() {
		return this.scancode;
	}

	public void setScancode(String scancode) {
		this.scancode = scancode;
	}

}
