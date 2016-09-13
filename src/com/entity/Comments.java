package com.entity;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name = "tb_comments")
public class Comments implements Serializable {
	private static final long serialVersionUID = 1L;

	private Integer cId;

	private Integer cUser;

	private Integer cGoods;

	private Date cDate;

	private String cComments;

	public Integer getcId() {
		return cId;
	}

	public Integer getcUser() {
		return cUser;
	}

	public Integer getcGoods() {
		return cGoods;
	}

	public Date getcDate() {
		return cDate;
	}

	public String getcComments() {
		return cComments;
	}

}