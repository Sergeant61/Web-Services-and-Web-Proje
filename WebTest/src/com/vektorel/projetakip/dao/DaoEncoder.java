package com.vektorel.projetakip.dao;

import com.vektorel.projetakip.model.Person;

public class DaoEncoder {

	public String[] personEn(Person person) {

		String[] persons = new String[] { person.getName(), person.getSurname() };

		return persons;

	}

}
