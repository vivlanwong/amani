package amani.wechart.platform.dao.entities;

// Generated 2015-6-23 2:29:39 by Hibernate Tools 4.3.1

/**
 * AmnProductRelevanceId generated by hbm2java
 */
public class AmnProductRelevanceId implements java.io.Serializable {

	private int pid;
	private int aid;

	public AmnProductRelevanceId() {
	}

	public AmnProductRelevanceId(int pid, int aid) {
		this.pid = pid;
		this.aid = aid;
	}

	public int getPid() {
		return this.pid;
	}

	public void setPid(int pid) {
		this.pid = pid;
	}

	public int getAid() {
		return this.aid;
	}

	public void setAid(int aid) {
		this.aid = aid;
	}

	public boolean equals(Object other) {
		if ((this == other))
			return true;
		if ((other == null))
			return false;
		if (!(other instanceof AmnProductRelevanceId))
			return false;
		AmnProductRelevanceId castOther = (AmnProductRelevanceId) other;

		return (this.getPid() == castOther.getPid())
				&& (this.getAid() == castOther.getAid());
	}

	public int hashCode() {
		int result = 17;

		result = 37 * result + this.getPid();
		result = 37 * result + this.getAid();
		return result;
	}

}