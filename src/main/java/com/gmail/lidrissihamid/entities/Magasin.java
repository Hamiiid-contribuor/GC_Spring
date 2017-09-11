package com.gmail.lidrissihamid.entities;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Magasin implements Serializable {

	/**
	 * Lidrissi Hamid
	 */
	private static final long serialVersionUID = 1L;

	@Id
	private String numero;
	private String adresse;
	private String description;

	public Magasin() {
		super();
		// TODO Auto-generated constructor stub
	}

	public String getNumero() {
		return numero;
	}

	public void setNumero(String numero) {
		this.numero = numero;
	}

	public String getAdresse() {
		return adresse;
	}

	public void setAdresse(String adresse) {
		this.adresse = adresse;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	@Override
	public String toString() {
		return "Magasin [numero=" + numero + ", adresse=" + adresse + ", description=" + description + "]";
	}

}
