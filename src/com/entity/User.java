package com.entity;

import java.io.ObjectStreamException;
import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "tb_user")
public class User implements Serializable, Cloneable {
	private static final long serialVersionUID = 5470796523767366586L;
	@Id
	@Column(name = "u_id")
	private Integer uId;
	@Column(name = "u_name")
	private String uName;
	@Column(name = "u_password")
	private String uPassword;
	@Column(name = "u_email")
	private String uEmail;
	@Column(name = "u_telephone")
	private String uTelephone;
	@Column(name = "u_address")
	private String uAddress;

	public User() {
		// TODO Auto-generated constructor stub

	}

	public User(Integer uId, String uName) {
		super();
		try {
			Thread.sleep(1);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		this.uId = uId;
		this.uName = uName;
	}

	public void setuId(Integer uId) {
		this.uId = uId;
	}

	public void setuName(String uName) {
		this.uName = uName;
	}

	public void setuPassword(String uPassword) {
		this.uPassword = uPassword;
	}

	public void setuEmail(String uEmail) {
		this.uEmail = uEmail;
	}

	public void setuTelephone(String uTelephone) {
		this.uTelephone = uTelephone;
	}

	public void setuAddress(String uAddress) {
		this.uAddress = uAddress;
	}

	public Integer getuId() {
		return uId;
	}

	public String getuName() {
		return uName;
	}

	public String getuPassword() {
		return uPassword;
	}

	public String getuEmail() {
		return uEmail;
	}

	public String getuTelephone() {
		return uTelephone;
	}

	public String getuAddress() {
		return uAddress;
	}

	@Override
	public String toString() {
		return "User [uId=" + uId + ", uName=" + uName + ", uPassword="
				+ uPassword + ", uEmail=" + uEmail + ", uTelephone="
				+ uTelephone + ", uAddress=" + uAddress + "]";
	}

	private Object readResolve() throws ObjectStreamException {
		System.out.println("开始反序列化");
		return null;
	}

	public Object clone() throws CloneNotSupportedException {
		return super.clone();
	}

}