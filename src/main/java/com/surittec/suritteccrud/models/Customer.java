package com.surittec.suritteccrud.models;

import java.io.Serializable;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.validation.constraints.NotNull;

@Entity
public class Customer implements Serializable{

	
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private long id;
	
	@NotNull(message="O nome não pode estar vazio")
	private String name;
	
	@NotNull(message="O cpf não pode estar vazio")
	@Column(name="cpf", length=11)
	private String CPF;
	
	@NotNull(message="O endereço não pode estar vazio")
	@OneToMany(cascade=CascadeType.ALL)
	private List<Address> address;
	
	@NotNull(message="O telefone não pode estar vazio")
	@OneToMany(cascade=CascadeType.ALL)
	private List<Phone> phone;
	
	@NotNull(message="O email não pode estar vazio")
	@OneToMany(cascade=CascadeType.ALL)
	private List<Mail> mail;

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getCPF() {
		return CPF;
	}

	public void setCPF(String cPF) {
		CPF = cPF;
	}

	public List<Address> getAddress() {
		return address;
	}

	public void setAddress(List<Address> address) {
		this.address = address;
	}

	public List<Phone> getPhone() {
		return phone;
	}

	public void setPhone(List<Phone> phone) {
		this.phone = phone;
	}

	public List<Mail> getMail() {
		return mail;
	}

	public void setMail(List<Mail> mail) {
		this.mail = mail;
	}
	
	
}
