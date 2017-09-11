package com.gmail.lidrissihamid.entities ; 
import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class SecteurActivite implements Serializable {

	/**
	 * Lidrissi Hamid
	 */
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	private String nom;

	public SecteurActivite() {
		super();
		// TODO Auto-generated constructor stub
	}

	public SecteurActivite(Long id, String nom) {
		super();
		this.id = id;
		this.nom = nom;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getNom() {
		return nom;
	}

	public void setNom(String nom) {
		this.nom = nom;
	}

	@Override
	public String toString() {
		return "SecteurActivite [id=" + id + ", nom=" + nom + "]";
	}

}
