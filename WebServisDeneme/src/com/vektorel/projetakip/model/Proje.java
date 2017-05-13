package com.vektorel.projetakip.model;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

@Entity
public class Proje {

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private int id;
	
	@Column(name = "proje_adi")
	private String projeAdi;
	
	@Column(name = "proje_aciklamasi")
	private String projeAciklamasi;
	
	@Column(name = "proje_buldulari")
	private String projeBuldulari;
	
	@Column(name = "baslangic_tarihi")
	private Date baslangicTarihi;
	
	@Column(name = "hedef_tarihi")
	private Date hedefTarihi;
	
	@ManyToOne
	private Durum durum;
	
	

	public Proje(String projeAdi, String projeAciklamasi, String projeBuldulari, Date baslangicTarihi, Date hedefTarihi,
			Durum durum) {
		this.projeAdi = projeAdi;
		this.projeAciklamasi = projeAciklamasi;
		this.projeBuldulari = projeBuldulari;
		this.baslangicTarihi = baslangicTarihi;
		this.hedefTarihi = hedefTarihi;
		this.durum = durum;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getProjeAdi() {
		return projeAdi;
	}

	public void setProjeAdi(String projeAdi) {
		this.projeAdi = projeAdi;
	}

	public String getProjeAciklamasi() {
		return projeAciklamasi;
	}

	public void setProjeAciklamasi(String projeAciklamasi) {
		this.projeAciklamasi = projeAciklamasi;
	}

	public String getProjeBuldulari() {
		return projeBuldulari;
	}

	public void setProjeBuldulari(String projeBuldulari) {
		this.projeBuldulari = projeBuldulari;
	}

	public Durum getDurum() {
		return durum;
	}

	public void setDurum(Durum durum) {
		this.durum = durum;
	}

	public Date getBaslangicTarihi() {
		return baslangicTarihi;
	}

	public void setBaslangicTarihi(Date baslangicTarihi) {
		this.baslangicTarihi = baslangicTarihi;
	}

	public Date getHedefTarihi() {
		return hedefTarihi;
	}

	public void setHedefTarihi(Date hedefTarihi) {
		this.hedefTarihi = hedefTarihi;
	}
	
	
	
	
	
}
