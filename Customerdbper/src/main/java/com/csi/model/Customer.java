package com.csi.model;

import org.springframework.stereotype.Component;

@Component
public class Customer {
	private int customerId;
	private String customerName;
	private long customercontactnumber;
	private String customerAddress;
	public int getCustomerId()
	{
		System.out.println("welcome to github");

		return customerId;
	}
	public void setCustomerId(int customerId) {
		this.customerId = customerId;
	}
	public String getCustomerName() {
		return customerName;
	}
	public void setCustomerName(String customerName) {
		this.customerName = customerName;
	}
	public long getCustomercontactnumber() {
		return customercontactnumber;
	}
	public void setCustomercontactnumber(long customercontactnumber) {
		this.customercontactnumber = customercontactnumber;
	}
	public String getCustomerAddress() {
		return customerAddress;
	}
	public void setCustomerAddress(String customerAddress) {
		this.customerAddress = customerAddress;
	}
	

	

}
