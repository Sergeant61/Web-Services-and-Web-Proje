package rec.server.decoder;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

import com.vektorel.projetakip.dao.DAO;
import com.vektorel.projetakip.model.Durum;
import com.vektorel.projetakip.model.Person;
import com.vektorel.projetakip.model.Proje;
import com.vektorel.projetakip.model.User;

public class DaoDecoder {

	private static Person personDe(String[] persons) {

		Person person = new Person(persons[0], persons[1]);

		return person;

	}

	private static Durum durumDe(String[] durums) {

		Durum durum = new Durum(durums[0]);

		return durum;

	}

	private static Proje projeDe(String[] projes, Durum durum) {

		SimpleDateFormat formatter = new SimpleDateFormat("yyyy-MM-dd");

		Date date1 = null, date2 = null;
		try {
			date1 = formatter.parse(projes[3]);
			date2 = formatter.parse(projes[4]);
		} catch (ParseException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		Proje proje = new Proje(projes[0], projes[1], projes[2], date1, date2, durum);

		return proje;

	}

	private static User userDe(String[] users, Person person) {

		User user = new User(users[0], users[1], person);

		return user;

	}

	/**
	 * 
	 * @param dizi
	 *            = kayýt yapýlmasýný istediðiniz entitynin verileri
	 * @param sayi
	 *            = entity seçimi 1 = person , 2 = durum , 3 = proje , 4 = user
	 */
	public static void kayit() {

		DAO.getInstance();

	}

}
