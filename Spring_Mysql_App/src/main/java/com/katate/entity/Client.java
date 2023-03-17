package com.katate.entity;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Objects;
import java.util.Set;

import com.fasterxml.jackson.annotation.JsonBackReference;
import com.fasterxml.jackson.annotation.JsonManagedReference;
import com.katate.entity.enums.ClientType;

import jakarta.persistence.CollectionTable;
import jakarta.persistence.ElementCollection;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;

@Entity
public class Client implements Serializable {

	private static final long serialVersionUID = 1L;
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int id;
	private String name;
	private String email;
	private String financesId;
	private int clientType;
	
	@ElementCollection
	@CollectionTable(name = "phoneNumbers")
	private Set<String> phoneNumbers = new HashSet<>();
	
	@JsonManagedReference
	@OneToMany(mappedBy = "client")
	private List<Address> adressList = new ArrayList<>();
	
	public Client() {
	}

	public Client(String name, String email, String financesId, ClientType clientType) {
		super();
		this.name = name;
		this.email = email;
		this.financesId = financesId;
		this.clientType = clientType.getId();
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getFinancesId() {
		return financesId;
	}

	public void setFinancesId(String financesId) {
		this.financesId = financesId;
	}

	public ClientType getClientType() {
		return ClientType.toEnum(clientType);
	}

	public void setClientType(ClientType clientType) {
		this.clientType = clientType.getId();
	}
	
	public Set<String> getPhoneNumberSet() {
		return phoneNumbers;
	}
	
	public void setPhoneNumberSet(Set<String> phoneNumberSet) {
		this.phoneNumbers = phoneNumberSet;
	}
	
	public List<Address> getAdressList() {
		return adressList;
	}
	
	public void setAdressList(List<Address> adressList) {
		this.adressList = adressList;
	}

	@Override
	public int hashCode() {
		return Objects.hash(id);
	}
	
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Client other = (Client) obj;
		return id == other.id;
	}

}
