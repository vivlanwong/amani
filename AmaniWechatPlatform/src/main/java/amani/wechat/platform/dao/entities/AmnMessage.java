package amani.wechat.platform.dao.entities;

// Generated 2015-6-23 2:29:39 by Hibernate Tools 4.3.1

/**
 * AmnMessage generated by hbm2java
 */
public class AmnMessage implements java.io.Serializable {

	private Integer id;
	private Integer mid;
	private Integer uid;
	private String name;
	private Boolean sex;
	private String contact;
	private String other;
	private Integer subTime;

	public AmnMessage() {
	}

	public AmnMessage(Integer mid, Integer uid, String name, Boolean sex,
			String contact, String other, Integer subTime) {
		this.mid = mid;
		this.uid = uid;
		this.name = name;
		this.sex = sex;
		this.contact = contact;
		this.other = other;
		this.subTime = subTime;
	}

	public Integer getId() {
		return this.id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public Integer getMid() {
		return this.mid;
	}

	public void setMid(Integer mid) {
		this.mid = mid;
	}

	public Integer getUid() {
		return this.uid;
	}

	public void setUid(Integer uid) {
		this.uid = uid;
	}

	public String getName() {
		return this.name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Boolean getSex() {
		return this.sex;
	}

	public void setSex(Boolean sex) {
		this.sex = sex;
	}

	public String getContact() {
		return this.contact;
	}

	public void setContact(String contact) {
		this.contact = contact;
	}

	public String getOther() {
		return this.other;
	}

	public void setOther(String other) {
		this.other = other;
	}

	public Integer getSubTime() {
		return this.subTime;
	}

	public void setSubTime(Integer subTime) {
		this.subTime = subTime;
	}

}
