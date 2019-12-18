package com.csi.service;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Component;

import com.csi.model.Customer;
@Component
public class CustomerDaoImpl implements CustomerDao {
@Autowired
JdbcTemplate jdbcTemplate;
@Autowired
Customer customer;
private static final String selectSQL= "select * from customer";
private static final String updateSQL= "update customer set customername=? where customerid=?";
private static final String deleteSQl= "delete from customer where customerid=?";
private static final String insertSQL= "insert into customer values(?,?,?,?)";
	@Override
	public List<Customer> getCustomerDetails() {
		// TODO Auto-generated method stub
		List<Customer> customers=new ArrayList<Customer>();
		List<Map<String,Object>> rows=jdbcTemplate.queryForList(selectSQL);
		for(Map<String,Object> row : rows){
			Customer customer=new Customer();
			customer.setCustomerId((int)row.get("customerid"));
			customer.setCustomerName((String)row.get("customername"));
			String cn=row.get("customernumber").toString();
			customer.setCustomercontactnumber(Long.valueOf(cn));
			customer.setCustomerAddress((String)row.get("customeraddress"));
			customers.add(customer);
			
		}
		return customers;
	}

	@Override
	public void saveCustomerDetails(Customer customer) {
		// TODO Auto-generated method stub
		jdbcTemplate.update(insertSQL,customer.getCustomerId(),customer.getCustomerName(),customer.getCustomercontactnumber(),customer.getCustomerAddress());
	}

	@Override
	public void updateCustomerDetails(Customer customer, int customerId) {
		// TODO Auto-generated method stub
		jdbcTemplate.update(updateSQL,customer.getCustomerName(),customerId);
		
	}

	@Override
	public void deleteCustomerDetails(int customerId) {
		// TODO Auto-generated method stub
		jdbcTemplate.update("deleteSQL,customerId");
		
	}

}
