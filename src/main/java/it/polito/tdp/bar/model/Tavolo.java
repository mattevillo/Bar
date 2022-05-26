package it.polito.tdp.bar.model;

public class Tavolo {

	private int Posti;
	private boolean occupato;
	
	
	public Tavolo(int posti, boolean occupato) {
		super();
		Posti = posti;
		this.occupato = occupato;
	}


	public int getPosti() {
		return Posti;
	}


	public void setPosti(int posti) {
		Posti = posti;
	}


	public boolean isOccupato() {
		return occupato;
	}


	public void setOccupato(boolean occupato) {
		this.occupato = occupato;
	}
	
	
}
