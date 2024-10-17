package com.campusdual.classroom;

import java.sql.SQLOutput;

public class Person {
	protected String name;
	protected String surname;

	public Person(String name, String surname) {
		this.name = name;
		this.surname = surname;
	}
	public void getDetails(){

		System.out.println( "Name: " + this.name + ", Surname: " + this.surname );
	}
}
