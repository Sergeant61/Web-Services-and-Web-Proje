package com.vektorel.projetakip.bean;

import java.util.List;

import javax.annotation.PostConstruct;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;

import com.vektorel.projetakip.dao.DAO;
import com.vektorel.projetakip.model.Durum;
import com.vektorel.projetakip.model.Proje;

@ManagedBean
@SessionScoped
public class ProjeBean {

	private Proje projeAdd;
	private Durum selectedDurum;
	private String selectedDurumString;
	private List<Durum> durumList;
	private List<Proje> projeList;

	@PostConstruct
	public void init() {
		this.projeAdd = new Proje();

//		 List<Durum> myDurums = DAO.getInstance().getDurumList();
//		 String[] myDurumDizi = new String[myDurums.size()];
//		
//		 for(int i=0; i < myDurums.size() ; i ++){
//		 myDurumDizi[i] = myDurums.get(i).getDurum();
//		 }

		this.durumList = DAO.getInstance().getDurumList();
		this.projeList = DAO.getInstance().getProjeList();
		;
	}
	
	
	public void addProjeFonk(){
		projeAdd.setDurum(selectedDurum);
		DAO.getInstance().addUser(projeAdd);
		this.projeList = DAO.getInstance().getProjeList();
	}
	

	public void setProjeAdd(Proje projeAdd) {
		this.projeAdd = projeAdd;
	}

	public Proje getProjeAdd() {
		return projeAdd;
	}

	public Durum getSelectedDurum() {
		return selectedDurum;
	}

	public void setSelectedDurum(Durum selectedDurum) {
		this.selectedDurum = selectedDurum;
	}

	public List<Durum> getDurumList() {
		return durumList;
	}

	public void setDurumList(List<Durum> durumList) {
		this.durumList = durumList;
	}


	public String getSelectedDurumString() {
		return selectedDurumString;
	}


	public void setSelectedDurumString(String selectedDurumString) {
		this.selectedDurumString = selectedDurumString;
	}


	public List<Proje> getProjeList() {
		return projeList;
	}


	public void setProjeList(List<Proje> projeList) {
		this.projeList = projeList;
	}

	
	
}
