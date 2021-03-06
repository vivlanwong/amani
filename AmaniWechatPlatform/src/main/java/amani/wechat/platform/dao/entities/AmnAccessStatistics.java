package amani.wechat.platform.dao.entities;

// Generated 2015-6-28 1:25:02 by Hibernate Tools 4.3.1

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import static javax.persistence.GenerationType.IDENTITY;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * AmnAccessStatistics generated by hbm2java
 */
@Entity
@Table(name = "amn_access_statistics", catalog = "amn")
public class AmnAccessStatistics implements java.io.Serializable {

	private Integer ipid;
	private Integer mid;
	private String ipdata;
	private int iptime;

	public AmnAccessStatistics() {
	}

	public AmnAccessStatistics(String ipdata, int iptime) {
		this.ipdata = ipdata;
		this.iptime = iptime;
	}

	public AmnAccessStatistics(Integer mid, String ipdata, int iptime) {
		this.mid = mid;
		this.ipdata = ipdata;
		this.iptime = iptime;
	}

	@Id
	@GeneratedValue(strategy = IDENTITY)
	@Column(name = "ipid", unique = true, nullable = false)
	public Integer getIpid() {
		return this.ipid;
	}

	public void setIpid(Integer ipid) {
		this.ipid = ipid;
	}

	@Column(name = "mid")
	public Integer getMid() {
		return this.mid;
	}

	public void setMid(Integer mid) {
		this.mid = mid;
	}

	@Column(name = "ipdata", nullable = false, length = 16)
	public String getIpdata() {
		return this.ipdata;
	}

	public void setIpdata(String ipdata) {
		this.ipdata = ipdata;
	}

	@Column(name = "iptime", nullable = false)
	public int getIptime() {
		return this.iptime;
	}

	public void setIptime(int iptime) {
		this.iptime = iptime;
	}

}
