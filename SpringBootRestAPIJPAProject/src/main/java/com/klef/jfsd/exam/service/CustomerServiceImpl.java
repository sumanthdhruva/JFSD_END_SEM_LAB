package com.klef.jfsd.exam.service;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.klef.jfsd.exam.model.Customer;
import com.klef.jfsd.exam.repository.CustomerRepository;

@Service
public class CustomerServiceImpl implements CustomerService
{
	@Autowired
	private CustomerRepository repository;

	@Override
	public String addcustomer(Customer c) 
	{
		repository.save(c);
		return "Customer added Successfully";
	}

	@Override
	public String updatecustomer(Customer c) 
	{
		Optional<Customer> object = repository.findById(c.getCustomerId());
	    String msg = null;
	    
	    if (object.isPresent()) 
	    {
	        Customer customer = object.get();
	        customer.setName(c.getName());
	        customer.setEmail(c.getEmail());
	        customer.setPhoneNumber(c.getPhoneNumber());
	        customer.setAddress(c.getAddress());
	        customer.setDateOfBirth(c.getDateOfBirth());
	        
	        repository.save(customer);
	        
	        msg = "Customer Updated Successfully";
	    } 
	    else 
	    {
	        msg = "Customer ID Not Found";
	    }
	    return msg;
	}

}
