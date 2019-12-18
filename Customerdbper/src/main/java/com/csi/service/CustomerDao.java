package com.csi.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.csi.model.Customer;

public interface CustomerDao {
	@Autowired
	
	public List<Customer> getCustomerDetails();
	public void saveCustomerDetails(Customer customer);
	public void updateCustomerDetails(Customer customer,int customerId);
	public void deleteCustomerDetails(int customerId);

}
