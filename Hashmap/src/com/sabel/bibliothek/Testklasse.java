package com.sabel.bibliothek;

public class Testklasse {

	public static void main(String[] args) {

		Bibliothek biblio = new Bibliothek();

		biblio.hinzufuegen(new Buch(new Autor("Sierra"), "Java von Kopf bis Fuss", "978-3-89721-448-4", 2006));
		biblio.hinzufuegen(new Buch(new Autor("Bloch"), "Effective Java", "978-0-321-35668-0", 2008));
		biblio.hinzufuegen(new Buch(new Autor("Throll"), "MySQL", "978-3-89842-188-1", 2002));

		Buch buch = biblio.suchen("978-0-321-35668-0");

		System.out.println(buch.toString());
		
		System.out.println(biblio.toString());

	}

}
