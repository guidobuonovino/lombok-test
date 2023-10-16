package com.techprudent.lomboktest.model;

import javax.annotation.PostConstruct;

import org.springframework.stereotype.Component;

public class WithoutLombok {

	private String address;
	private String age;
	private String email;
	private String name;

	public WithoutLombok() {
		super();
	}

	public WithoutLombok(String name, String age, String address, String email) {
		super();
		this.name = name;
		this.age = age;
		this.address = address;
		this.email = email;
	}

	@PostConstruct
	private void constructWithoutLombokObj() {

		new WithoutLombok("withoutLombok", "26", "India", "techprudent91@gmail.com");
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		WithoutLombok other = (WithoutLombok) obj;
		if (address == null) {
			if (other.address != null)
				return false;
		} else if (!address.equals(other.address))
			return false;
		if (age == null) {
			if (other.age != null)
				return false;
		} else if (!age.equals(other.age))
			return false;
		if (email == null) {
			if (other.email != null)
				return false;
		} else if (!email.equals(other.email))
			return false;
		if (name == null) {
			if (other.name != null)
				return false;
		} else if (!name.equals(other.name))
			return false;
		return true;
	}

	public String getAddress() {
		return address;
	}

	public String getAge() {
		return age;
	}

	public String getEmail() {
		return email;
	}

	public String getName() {
		return name;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((address == null) ? 0 : address.hashCode());
		result = prime * result + ((age == null) ? 0 : age.hashCode());
		result = prime * result + ((email == null) ? 0 : email.hashCode());
		result = prime * result + ((name == null) ? 0 : name.hashCode());
		return result;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public void setAge(String age) {
		this.age = age;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public void setName(String name) {
		this.name = name;
	}

	@Override
	public String toString() {
		return "WithoutLombok [name=" + name + ", age=" + age + ", address=" + address + ", email=" + email + "]";
	}

}
