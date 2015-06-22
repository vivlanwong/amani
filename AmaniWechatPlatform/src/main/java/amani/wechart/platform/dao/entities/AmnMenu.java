package amani.wechart.platform.dao.entities;

// Generated 2015-6-23 2:29:39 by Hibernate Tools 4.3.1

/**
 * AmnMenu generated by hbm2java
 */
public class AmnMenu implements java.io.Serializable {

	private Integer id;
	private int parent;
	private String type;
	private String key;
	private String name;
	private int sort;
	private boolean isopen;

	public AmnMenu() {
	}

	public AmnMenu(int parent, int sort, boolean isopen) {
		this.parent = parent;
		this.sort = sort;
		this.isopen = isopen;
	}

	public AmnMenu(int parent, String type, String key, String name, int sort,
			boolean isopen) {
		this.parent = parent;
		this.type = type;
		this.key = key;
		this.name = name;
		this.sort = sort;
		this.isopen = isopen;
	}

	public Integer getId() {
		return this.id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public int getParent() {
		return this.parent;
	}

	public void setParent(int parent) {
		this.parent = parent;
	}

	public String getType() {
		return this.type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public String getKey() {
		return this.key;
	}

	public void setKey(String key) {
		this.key = key;
	}

	public String getName() {
		return this.name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getSort() {
		return this.sort;
	}

	public void setSort(int sort) {
		this.sort = sort;
	}

	public boolean isIsopen() {
		return this.isopen;
	}

	public void setIsopen(boolean isopen) {
		this.isopen = isopen;
	}

}
