package jappan.model;
// Generated Jul 15, 2021, 10:46:24 PM by Hibernate Tools 5.4.30.Final

import java.util.Date;
import java.util.HashSet;
import java.util.Set;

/**
 * ExamPart generated by hbm2java
 */
public class ExamPart implements java.io.Serializable {

	private Integer id;
	private String examName;
	private int activeFlag;
	private Date createDate;
	private Date updateDate;
	private Set exams = new HashSet(0);

	public ExamPart() {
	}

	public ExamPart(String examName, int activeFlag, Date createDate, Date updateDate) {
		this.examName = examName;
		this.activeFlag = activeFlag;
		this.createDate = createDate;
		this.updateDate = updateDate;
	}

	public ExamPart(String examName, int activeFlag, Date createDate, Date updateDate, Set exams) {
		this.examName = examName;
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

	public String getExamName() {
		return this.examName;
	}

	public void setExamName(String examName) {
		this.examName = examName;
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
