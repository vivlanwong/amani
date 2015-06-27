package amani.wechat.platform.dao.entities;

// Generated 2015-6-28 1:25:02 by Hibernate Tools 4.3.1

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import static javax.persistence.GenerationType.IDENTITY;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * AmnMpages generated by hbm2java
 */
@Entity
@Table(name = "amn_mpages", catalog = "amn")
public class AmnMpages implements java.io.Serializable {

	private Integer id;
	private Integer uid;
	private String musicPath;
	private String sharePath;
	private String shareTitle;
	private String shareIntro;
	private String pageContent;
	private String formImg;
	private Boolean specType;
	private Integer formMax;
	private String formMaxMessage;
	private String formBtnText1;
	private String formSuccessUrl;
	private String formTel;
	private String formContent;
	private Byte isopen;
	private Byte status;
	private String seo;
	private Integer createtime;
	private Integer pv;

	public AmnMpages() {
	}

	public AmnMpages(Integer uid, String musicPath, String sharePath,
			String shareTitle, String shareIntro, String pageContent,
			String formImg, Boolean specType, Integer formMax,
			String formMaxMessage, String formBtnText1, String formSuccessUrl,
			String formTel, String formContent, Byte isopen, Byte status,
			String seo, Integer createtime, Integer pv) {
		this.uid = uid;
		this.musicPath = musicPath;
		this.sharePath = sharePath;
		this.shareTitle = shareTitle;
		this.shareIntro = shareIntro;
		this.pageContent = pageContent;
		this.formImg = formImg;
		this.specType = specType;
		this.formMax = formMax;
		this.formMaxMessage = formMaxMessage;
		this.formBtnText1 = formBtnText1;
		this.formSuccessUrl = formSuccessUrl;
		this.formTel = formTel;
		this.formContent = formContent;
		this.isopen = isopen;
		this.status = status;
		this.seo = seo;
		this.createtime = createtime;
		this.pv = pv;
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

	@Column(name = "uid")
	public Integer getUid() {
		return this.uid;
	}

	public void setUid(Integer uid) {
		this.uid = uid;
	}

	@Column(name = "musicPath", length = 128)
	public String getMusicPath() {
		return this.musicPath;
	}

	public void setMusicPath(String musicPath) {
		this.musicPath = musicPath;
	}

	@Column(name = "sharePath", length = 128)
	public String getSharePath() {
		return this.sharePath;
	}

	public void setSharePath(String sharePath) {
		this.sharePath = sharePath;
	}

	@Column(name = "shareTitle", length = 128)
	public String getShareTitle() {
		return this.shareTitle;
	}

	public void setShareTitle(String shareTitle) {
		this.shareTitle = shareTitle;
	}

	@Column(name = "shareIntro", length = 128)
	public String getShareIntro() {
		return this.shareIntro;
	}

	public void setShareIntro(String shareIntro) {
		this.shareIntro = shareIntro;
	}

	@Column(name = "pageContent", length = 65535)
	public String getPageContent() {
		return this.pageContent;
	}

	public void setPageContent(String pageContent) {
		this.pageContent = pageContent;
	}

	@Column(name = "formImg", length = 128)
	public String getFormImg() {
		return this.formImg;
	}

	public void setFormImg(String formImg) {
		this.formImg = formImg;
	}

	@Column(name = "specType")
	public Boolean getSpecType() {
		return this.specType;
	}

	public void setSpecType(Boolean specType) {
		this.specType = specType;
	}

	@Column(name = "formMax")
	public Integer getFormMax() {
		return this.formMax;
	}

	public void setFormMax(Integer formMax) {
		this.formMax = formMax;
	}

	@Column(name = "formMaxMessage", length = 64)
	public String getFormMaxMessage() {
		return this.formMaxMessage;
	}

	public void setFormMaxMessage(String formMaxMessage) {
		this.formMaxMessage = formMaxMessage;
	}

	@Column(name = "formBtnText1", length = 16)
	public String getFormBtnText1() {
		return this.formBtnText1;
	}

	public void setFormBtnText1(String formBtnText1) {
		this.formBtnText1 = formBtnText1;
	}

	@Column(name = "formSuccessUrl", length = 256)
	public String getFormSuccessUrl() {
		return this.formSuccessUrl;
	}

	public void setFormSuccessUrl(String formSuccessUrl) {
		this.formSuccessUrl = formSuccessUrl;
	}

	@Column(name = "formTel", length = 32)
	public String getFormTel() {
		return this.formTel;
	}

	public void setFormTel(String formTel) {
		this.formTel = formTel;
	}

	@Column(name = "formContent", length = 65535)
	public String getFormContent() {
		return this.formContent;
	}

	public void setFormContent(String formContent) {
		this.formContent = formContent;
	}

	@Column(name = "isopen")
	public Byte getIsopen() {
		return this.isopen;
	}

	public void setIsopen(Byte isopen) {
		this.isopen = isopen;
	}

	@Column(name = "status")
	public Byte getStatus() {
		return this.status;
	}

	public void setStatus(Byte status) {
		this.status = status;
	}

	@Column(name = "seo", length = 512)
	public String getSeo() {
		return this.seo;
	}

	public void setSeo(String seo) {
		this.seo = seo;
	}

	@Column(name = "createtime")
	public Integer getCreatetime() {
		return this.createtime;
	}

	public void setCreatetime(Integer createtime) {
		this.createtime = createtime;
	}

	@Column(name = "pv")
	public Integer getPv() {
		return this.pv;
	}

	public void setPv(Integer pv) {
		this.pv = pv;
	}

}