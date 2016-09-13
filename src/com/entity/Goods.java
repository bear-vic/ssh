package com.entity;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name = "tb_goods")
public class Goods implements Serializable {
	private static final long serialVersionUID = 1L;

	private Integer gId;

	private String gTitle;

	private Integer gUid;

	private BigDecimal gPrice;

	private String gName;

	private String gPic;

	private Date gDate;

	private String gDescrption;

	public Integer getgId() {
		return gId;
	}

	public String getgTitle() {
		return gTitle;
	}

	public Integer getgUid() {
		return gUid;
	}

	public BigDecimal getgPrice() {
		return gPrice;
	}

	public String getgName() {
		return gName;
	}

	public String getgPic() {
		return gPic;
	}

	public Date getgDate() {
		return gDate;
	}

	public String getgDescrption() {
		return gDescrption;
	}

}