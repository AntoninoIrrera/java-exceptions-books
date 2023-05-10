package org.lessons.java;

public class Libro {
	
	private String titolo;
	private int numeroPagine;
	private String autore;
	private String editore;
	
	public Libro(String titolo, int numeroPagine, String autore, String editore) throws Exception {
		
		
		setAutore(autore);
		setEditore(editore);
		setNumeroPagine(numeroPagine);
		setTitolo(titolo);
		
		
		
	}

	public String getTitolo() {
		return titolo;
	}

	public void setTitolo(String titolo) throws Exception {
		
		if(titolo.equals("")) {
//			System.out.println("titolo non valido");
			throw new Exception("titolo non valido");
		}
		
		this.titolo = titolo;
	}

	public int getNumeroPagine() {
		return numeroPagine;
	}

	public void setNumeroPagine(int numeroPagine) throws Exception {
		
		if(numeroPagine <= 0) {
			throw new Exception("numero pagine non valido");
		}
		
		this.numeroPagine = numeroPagine;
	}

	public String getAutore() {
		return autore;
	}

	public void setAutore(String autore) throws Exception {
		
		if(autore.equals("")) {
			throw new Exception("autore non valido");
		}
		
		this.autore = autore;
	}

	public String getEditore() {
		return editore;
	}

	public void setEditore(String editore) {
		this.editore = editore;
	}
	
	
	@Override
	public String toString() {
		
		return "l " + "titolo: " + getTitolo() + " autore: " + getAutore() + " numero pagine: " + getNumeroPagine() + " editore: " + getEditore();
	}
	
	
}
