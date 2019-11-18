package com.surittec.suritteccrud.resources;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.surittec.suritteccrud.models.PhoneType;
import com.surittec.suritteccrud.repository.PhoneTypeRepository;

@CrossOrigin(origins="*")
@RestController
@RequestMapping(value="/api")
public class PhoneTypeResource {
	
	@Autowired
	PhoneTypeRepository phoneTypeRepository;
	
	@GetMapping("/phone-types")
	public List<PhoneType>index(){
		return phoneTypeRepository.findAll();
	}
	
}
