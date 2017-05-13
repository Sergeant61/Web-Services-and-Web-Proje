package com.vektorel.projetakip.main;

import javax.xml.rpc.ServiceException;

import com.vektorel.projetakip.dao.DaoEncoder;
import com.vektorel.projetakip.model.Person;

import rec.server.decoder.DaoDecoder;
import rec.server.decoder.DaoDecoderService;
import rec.server.decoder.DaoDecoderServiceLocator;
import rec.server.dizi.DiziDeneme;
import rec.server.dizi.DiziDenemeService;
import rec.server.dizi.DiziDenemeServiceLocator;
import rec.server.hesap.Hesapmakinesi;
import rec.server.hesap.HesapmakinesiService;
import rec.server.hesap.HesapmakinesiServiceLocator;

public class Islem {
	
	public static void main(String[] args) {
//		HesapmakinesiService service = new HesapmakinesiServiceLocator();
//		try {
//			Hesapmakinesi port = service.getHesapmakinesi();
//			System.out.println(port.topla(30,50));
//			
//		} catch (Exception e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}
		
//		int[] sayiDizi = new int[]{3,5,6,1,5,1,45,}; 
//		String[] textDizi = new String[sayiDizi.length];
//		
//		
//		DiziDenemeService service1 = new DiziDenemeServiceLocator();
//		
//		try {
//			DiziDeneme port = service1.getDiziDeneme();
//			
//			textDizi = port.dizi(sayiDizi);
//			
//			for(int i = 0 ; i < textDizi.length ; i ++  ){
//				System.out.println(textDizi[i]);
//			}
//			
//			
//		} catch (Exception e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}
		
		Person person = new Person();
		person.setName("Recep");
		person.setSurname("Özen");
		
		DaoEncoder daoEncoder = new DaoEncoder();
		String[] dizi = daoEncoder.personEn(person);
		
		DaoDecoderService service = new DaoDecoderServiceLocator();
		try {
			DaoDecoder port = service.getDaoDecoder();
			port.kayit();
			
			
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
	}

}
