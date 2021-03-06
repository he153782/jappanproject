package jappan.model;
// Generated Jul 15, 2021, 10:46:24 PM by Hibernate Tools 5.4.30.Final

import java.util.Date;
import java.util.HashSet;
import java.util.Set;

/**
 * Level generated by hbm2java
 */
public class Level implements java.io.Serializable {

	private Integer id;
	private String name;
	private String image;
	private int activeFlag;
	private Date createDate;
	private Date updateDate;
	private Set exams = new HashSet(0);

	public Level() {
	}

	public Level(String name,String image, int activeFlag, Date createDate, Date updateDate) {
		this.name = name;
		this.image=image;
		this.activeFlag = activeFlag;
		this.createDate = createDate;
		this.updateDate = updateDate;
	}

	public Level(String name,String image, int activeFlag, Date createDate, Date updateDate, Set exams) {
		this.name = name;
		this.image=image;
		this.activeFlag = activeFlag;
		this.createDate = createDate;
		this.updateDate = updateDate;
		this.exams = exams;
	}

	public Integer getId() {
		return this.id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getName() {
		return this.name;
	}

	public void setName(String name) {
		this.name = name;
	}
	

	public String getImage() {
		return image;
	}

	public void setImage(String image) {
		this.image = image;
	}

	public int getActiveFlag() {
		return this.activeFlag;
	}

	public void setActiveFlag(int activeFlag) {
		this.activeFlag = activeFlag;
	}

	public Date getCreateDate() {
		return this.createDate;
	}

	public void setCreateDate(Date createDate) {
		this.createDate = createDate;
	}

	public Date getUpdateDate() {
		return this.updateDate;
	}

	public void setUpdateDate(Date updateDate) {
		this.updateDate = updateDate;
	}

	public Set getExams() {
		return this.exams;
	}

	public void setExams(Set exams) {
		this.exams = exams;
	}

}
