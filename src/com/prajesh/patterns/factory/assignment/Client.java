package com.prajesh.patterns.factory.assignment;

public class Client {

	public Person createPerson(String type) {
		Person p=PersonFactory.createPerson(type);
		p.wish();
		return p;
	}
}
