package com.sabel.bibliothek;

import java.util.HashMap;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap.KeySetView;

public class Bibliothek {

	private HashMap<String, Buch> map;

	public Bibliothek() {
		super();
		this.map = new HashMap<>();
	}

	public void hinzufuegen(Buch b) {

		map.put(b.getIsbn(), b);

	}

	public Buch suchen(String isbn) {

		return map.get(isbn);

	}

	public Buch suchen(Buch buch) {

		return map.get(buch.getIsbn());

	}

	public String toString() {

		String retval = "";

		Set<String> ks = map.keySet();

		for (String key : ks) {
			retval += "ISBN: " + map.get(key).getIsbn() + " Titel: " + map.get(key).getTitel() + "\n";
		}
		
		return retval;

	}
}
