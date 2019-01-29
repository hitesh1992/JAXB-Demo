package com.example.jaxbdemo.entity;

import java.io.Serializable;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement(name="trade")
@XmlAccessorType(XmlAccessType.FIELD)
public class Trade implements Serializable{
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	
	
	@XmlElement
	private Integer trade_id;
	@XmlElement
	private String trade_date;
	@XmlElement
	private String trade_name;
	@XmlElement
	private String trade_key;
	@XmlElement
	private String trade_order_no;
	@XmlElement
	private String trade_amount;
	@XmlElement
	private Department department;
	
	
	public Trade() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	
	
	
	
	public Trade(Integer trade_id, String trade_date, String trade_name, String trade_key, String trade_order_no,
			String trade_amount, Department department) {
		super();
		this.trade_id = trade_id;
		this.trade_date = trade_date;
		this.trade_name = trade_name;
		this.trade_key = trade_key;
		this.trade_order_no = trade_order_no;
		this.trade_amount = trade_amount;
		this.department = department;
	}





	public Integer getTrade_id() {
		return trade_id;
	}





	public void setTrade_id(Integer trade_id) {
		this.trade_id = trade_id;
	}





	public String getTrade_date() {
		return trade_date;
	}





	public void setTrade_date(String trade_date) {
		this.trade_date = trade_date;
	}





	public String getTrade_name() {
		return trade_name;
	}





	public void setTrade_name(String trade_name) {
		this.trade_name = trade_name;
	}





	public String getTrade_key() {
		return trade_key;
	}





	public void setTrade_key(String trade_key) {
		this.trade_key = trade_key;
	}





	public String getTrade_order_no() {
		return trade_order_no;
	}





	public void setTrade_order_no(String trade_order_no) {
		this.trade_order_no = trade_order_no;
	}





	public String getTrade_amount() {
		return trade_amount;
	}





	public void setTrade_amount(String trade_amount) {
		this.trade_amount = trade_amount;
	}





	public Department getDepartment() {
		return department;
	}





	public void setDepartment(Department department) {
		this.department = department;
	}





	@Override
	public String toString() {
		return "Trade [trade_id=" + trade_id + ", trade_date=" + trade_date + ", trade_name=" + trade_name
				+ ", trade_key=" + trade_key + ", trade_order_no=" + trade_order_no + ", trade_amount=" + trade_amount
				+ ", department=" + department + "]";
	}

	
	
	

}
