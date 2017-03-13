package com.sabel.bibliothek;

public class Buch {

	private Autor autor;
	private String titel;
	private String isbn;
	private int erscheinungsjahr;

	public Buch(String titel, String isbn) {
		super();
		this.titel = titel;
		this.isbn = isbn;
	}

	public Buch(Autor autor, String titel, String isbn, int erscheinungsjahr) {
		super();
		this.autor = autor;
		this.titel = titel;
		this.isbn = isbn;
		this.erscheinungsjahr = erscheinungsjahr;
	}

	public Autor getAutor() {
		return autor;
	}

	public void setAutor(Autor autor) {
		this.autor = autor;
	}

	public String getTitel() {
		return titel;
	}

	public void setTitel(String titel) {
		this.titel = titel;
	}

	public String getIsbn() {
		return isbn;
	}

	public void setIsbn(String isbn) {
		this.isbn = isbn;
	}

	public int getErscheinungsjahr() {
		return erscheinungsjahr;
	}

	public void setErscheinungsjahr(int erscheinungsjahr) {
		this.erscheinungsjahr = erscheinungsjahr;
	}
	
	
	public String toString() {
		
		return "ISBN: " + this.getIsbn() + ", Titel: " + this.getTitel() + ", Erscheinungsjahr: " + this.getErscheinungsjahr() + ", Autor: " + this.getAutor().getNachname();

	}

}
