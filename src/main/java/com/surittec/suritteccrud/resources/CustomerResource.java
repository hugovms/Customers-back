package com.surittec.suritteccrud.resources;

import java.util.List;
import java.util.Optional;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.surittec.suritteccrud.models.Customer;
import com.surittec.suritteccrud.repository.CustomerRepository;

@CrossOrigin(origins="*")
@RestController
@RequestMapping(value="/api")
public class CustomerResource {
	
	@Autowired
	CustomerRepository customerRepository;
	
	
	@GetMapping("/customers")
	public List<Customer> index(){
		return customerRepository.findAll();
	}
	
	@GetMapping("/customer/{id}")
	public Customer getById(@PathVariable(value="id") long id) {
		return customerRepository.findById(id);
	}
	
	@PostMapping("/customer")
	public Customer create(@RequestBody Customer customer) {
		return customerRepository.save(customer);
	}
	
	@DeleteMapping("/customer/{id}")
	public void destroy(@PathVariable(value="id") Long id) {
		customerRepository.deleteById(id);
	}
	
	@PutMapping("/customer/{id}")
	public Customer update(@PathVariable(value="id") Long id, @Valid @RequestBody Customer customerDetails) throws Exception{
		
		Customer customer = customerRepository.findById(id).orElseThrow(() -> new Exception());
		
		customer.setName(customerDetails.getName() == null ? customer.getName() : customerDetails.getName());
		customer.setCPF(customerDetails.getCPF() == null ? customer.getCPF() : customerDetails.getCPF());
		customer.setMail(customerDetails.getMail() == null ? customer.getMail() : customerDetails.getMail());
		customer.setAddress(customerDetails.getAddress() == null ? customer.getAddress() : customerDetails.getAddress());
		customer.setPhone(customerDetails.getPhone() == null ? customer.getPhone() : customerDetails.getPhone());
		
		
		return customerRepository.save(customer);
	}
	
}

