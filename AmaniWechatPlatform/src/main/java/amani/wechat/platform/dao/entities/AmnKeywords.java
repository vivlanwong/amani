package amani.wechat.platform.dao.entities;

// Generated 2015-6-28 1:25:02 by Hibernate Tools 4.3.1

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import static javax.persistence.GenerationType.IDENTITY;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * AmnKeywords generated by hbm2java
 */
@Entity
@Table(name = "amn_keywords", catalog = "amn")
public class AmnKeywords implements java.io.Serializable {

	private Integer id;
	private byte type;
	private String title;
	private String content;
	private boolean isopen;
	private int createtime;

	public AmnKeywords() {
	}

	public AmnKeywords(byte type, boolean isopen, int createtime) {
		this.type = type;
		this.isopen = isopen;
		this.createtime = createtime;
	}

	public AmnKeywords(byte type, String title, String content, boolean isopen,
			int createtime) {
		this.type = type;
		this.title = title;
		this.content = content;
		this.isopen = isopen;
		this.createtime = createtime;
	}

	@Id
	@GeneratedValue(strategy = IDENTITY)
	@Column(name = "id", unique = true, nullable = false)
	public Integer getId() {
		return this.id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	@Column(name = "type", nullable = false)
	public byte getType() {
		return this.type;
	}

	public void setType(byte type) {
		this.type = type;
	}

	@Column(name = "title")
	public String getTitle() {
		return this.title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	@Column(name = "content", length = 16777215)
	public String getContent() {
		return this.content;
	}

	public void setContent(String content) {
		this.content = content;
	}

	@Column(name = "isopen", nullable = false)
	public boolean isIsopen() {
		return this.isopen;
	}

	public void setIsopen(boolean isopen) {
		this.isopen = isopen;
	}

	@Column(name = "createtime", nullable = false)
	public int getCreatetime() {
		return this.createtime;
	}

	public void setCreatetime(int createtime) {
		this.createtime = createtime;
	}

}
