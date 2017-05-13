package com.vektorel.projetakip.model;

import java.util.Date;

public class Proje {

	private int id;

	private String projeAdi;

	private String projeAciklamasi;

	private String projeBuldulari;

	private Date baslangicTarihi;

	private Date hedefTarihi;

	private Durum durum;

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
