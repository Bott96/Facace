package ingsw.patterns.Facade;

import java.util.Vector;

public class Hotel {

	private String nome;
	private String location;
	private float Prezzo;

	public Hotel(String n, String l,float p) {
		nome = n;
		location = l;
		
		Prezzo = p;

	}
	

	public Hotel() {
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getLocation() {
		return location;
	}

	public void setLocation(String location) {
		this.location = location;
	}


	public float getPrezzo() {
		return Prezzo;
	}

	public void setPrezzo(float prezzo) {
		Prezzo = prezzo;
	}
	
	@Override
	public String toString() {
		
		return nome+", "+location;
	}

}
