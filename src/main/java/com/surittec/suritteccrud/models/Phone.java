package com.surittec.suritteccrud.models;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.validation.constraints.NotNull;


@Entity
public class Phone implements Serializable{
	
	private static final long serialVersionUID = 1L;
	
	public Phone() {
		
	}
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private long id;
	
	@NotNull(message="O número de telefone não pode estar vazio")
	private String phoneNumber;
	
//	@NotNull(message="O tipo de telefone não pode estar vazio")
	@OneToOne
	private PhoneType type;


	public PhoneType getType() {
		return type;
	}


	public void setType(PhoneType type) {
		this.type = type;
	}


	public long getId() {
		return id;
	}


	public void setId(long id) {
		this.id = id;
	}

	public String getPhoneNumber() {
		return phoneNumber;
	}


	public void setPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
	}

}
