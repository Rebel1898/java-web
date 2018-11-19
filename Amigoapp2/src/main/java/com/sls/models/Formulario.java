package com.sls.models;

public class Formulario {

	
	
	
	private String firstname1;
	private String lastname1;
	private String email1;
	private String password1;
	private int pin1;
	
	
	public Formulario(String firstname, String lastname, String email, String password, int pin) {
		super();
		this.firstname1 = firstname;
		this.lastname1 = lastname;
		this.email1 = email;
		this.password1 = password;
		this.pin1 = pin;
	}
	
	
	
	 
	public String getFirstname1() {
		return firstname1;
	}



	public void setFirstname1(String firstname1) {
		this.firstname1 = firstname1;
	}



	public String getLastname1() {
		return lastname1;
	}



	public void setLastname1(String lastname1) {
		this.lastname1 = lastname1;
	}



	public String getEmail1() {
		return email1;
	}



	public void setEmail1(String email1) {
		this.email1 = email1;
	}



	public String getPassword1() {
		return password1;
	}



	public void setPassword1(String password1) {
		this.password1 = password1;
	}






	public int getPin1() {
		return pin1;
	}




	public void setPin1(int pin1) {
		this.pin1 = pin1;
	}




	public Formulario() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	
	
	
	
	
}
