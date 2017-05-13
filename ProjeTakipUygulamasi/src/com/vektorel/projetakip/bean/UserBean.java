package com.vektorel.projetakip.bean;

import java.util.List;

import javax.annotation.PostConstruct;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;

import com.vektorel.projetakip.dao.DAO;
import com.vektorel.projetakip.model.Person;
import com.vektorel.projetakip.model.User;

@ManagedBean
@SessionScoped
public class UserBean {

	private List<User> userList;
	private User userAdd;
	private Person personAdd;
	
	@PostConstruct
	public void init(){
		this.userAdd = new User();
		this.userList = DAO.getInstance().getUserList();
		this.personAdd = new Person();
	}
	
	public void addUserFonk(){
		
		DAO.getInstance().addUser(this.personAdd);
		
		this.userAdd.setPerson(personAdd);
		
		DAO.getInstance().addUser(this.userAdd);
	}
	
	public void setUserList(List<User> userList) {
		this.userList = userList;
	}
	
	public List<User> getUserList() {
		return userList;
	}
	
	public void setUserAdd(User userAdd) {
		this.userAdd = userAdd;
	}
	
	public User getUserAdd() {
		return userAdd;
	}
	
	public void setPersonAdd(Person personAdd) {
		this.personAdd = personAdd;
	}
	
	public Person getPersonAdd() {
		return personAdd;
	}
	
	
}
