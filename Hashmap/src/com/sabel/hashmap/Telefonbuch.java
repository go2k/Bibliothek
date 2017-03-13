package com.sabel.hashmap;

import java.util.HashMap;

public class Telefonbuch {

	private HashMap<String, String> telefonbuch;


	
	
	public Telefonbuch() {

		telefonbuch = new HashMap<>(1000);
	}

	public String  nummerEintragen(String name, String nummer) {
		
		return telefonbuch.put(name, nummer);
		
	}

	public String nummerSuchen(String name) {
		return telefonbuch.get(name);
	}
	
	public boolean keyEnthalten(String name) {
		
		return telefonbuch.containsKey(name);
		
	}
	
	public boolean wertEnthalten(String nummer) {
		return telefonbuch.containsValue(nummer);	
	}

	public static void main(String[] args) {

		 Telefonbuch telbook = new Telefonbuch();
				

		 telbook.nummerEintragen("Müller", "11111");
		 telbook.nummerEintragen("Meyer", "22222");
		 telbook.nummerEintragen("Huber", "33333");
		 telbook.nummerEintragen("König", "44444");
		 telbook.nummerEintragen("Maier", "55555");
		 telbook.nummerEintragen("Groß", "66666");

		 System.out.println(telbook.nummerSuchen("Maier"));
		 System.out.println(telbook.keyEnthalten("König"));
		 System.out.println(telbook.wertEnthalten("44444"));
	}
	
}
