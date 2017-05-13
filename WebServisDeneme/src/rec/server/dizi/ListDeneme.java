package rec.server.dizi;

import java.util.ArrayList;
import java.util.List;

public class ListDeneme {

	public List<String> dizi(List<Integer> l) {

		List<String> myList = new ArrayList<>();

		for (int i = 0; i < l.size(); i++) {
			myList.add(String.valueOf(l.get(i)));
		}

		return myList;
	}

}
