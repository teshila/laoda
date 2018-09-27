package com.ly.bean;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import org.hibernate.annotations.GenericGenerator;

@Entity
@Table(name = "stock")
public class Stock {

	private String id;
	private String name;
	private String code;
	private String currentPrice;
	private String prevClose;
	private String rate;

	
	@Column
	public String getCode() {
		return code;
	}

	@Column
	public String getCurrentPrice() {
		return currentPrice;
	}

	@Id
	@GeneratedValue(generator = "id")
	@GenericGenerator(name = "id", strategy = "uuid")
	public String getId() {
		return id;
	}

	@Column
	public String getName() {
		return name;
	}

	@Column
	public String getPrevClose() {
		return prevClose;
	}

	@Column
	public String getRate() {
		return rate;
	}

	public void setCode(String code) {
		this.code = code;
	}

	public void setCurrentPrice(String currentPrice) {
		this.currentPrice = currentPrice;
	}

	public void setId(String id) {
		this.id = id;
	}

	public void setName(String name) {
		this.name = name;
	}

	public void setPrevClose(String prevClose) {
		this.prevClose = prevClose;
	}

	public void setRate(String rate) {
		this.rate = rate;
	}

}
