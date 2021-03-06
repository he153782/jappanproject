package jappan.model;
// Generated Jul 15, 2021, 10:46:24 PM by Hibernate Tools 5.4.30.Final

import java.util.Date;
import java.util.HashSet;
import java.util.Set;

/**
 * Comment generated by hbm2java
 */
public class Comment implements java.io.Serializable {

	private Integer id;
	private Lession lession;
	private Users users;
	private String content;
	private int activeFlag;
	private Date createDate;
	private Date updateDate;
	private Set replies = new HashSet(0);

	public Comment() {
	}

	public Comment(Lession lession, Users users, String content, int activeFlag, Date createDate, Date updateDate) {
		this.lession = lession;
		this.users = users;
		this.content = content;
		this.activeFlag = activeFlag;
		this.createDate = createDate;
		this.updateDate = updateDate;
	}

	public Comment(Lession lession, Users users, String content, int activeFlag, Date createDate, Date updateDate,
			Set replies) {
		this.lession = lession;
		this.users = users;
		this.content = content;
		this.activeFlag = activeFlag;
		this.createDate = createDate;
		this.updateDate = updateDate;
		this.replies = replies;
	}

	public Integer getId() {
		return this.id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public Lession getLession() {
		return this.lession;
	}

	public void setLession(Lession lession) {
		this.lession = lession;
	}

	public Users getUsers() {
		return this.users;
	}

	public void setUsers(Users users) {
		this.users = users;
	}

	public String getContent() {
		return this.content;
	}

	public void setContent(String content) {
		this.content = content;
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

	public Set getReplies() {
		return this.replies;
	}

	public void setReplies(Set replies) {
		this.replies = replies;
	}

}
