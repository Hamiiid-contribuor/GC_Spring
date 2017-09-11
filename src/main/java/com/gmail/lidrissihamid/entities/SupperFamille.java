package com.gmail.lidrissihamid.entities ; 
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;

@Entity
public class SupperFamille implements Serializable {

	/**
	 * Lidrissi Hamid
	 */
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;

	private String libelle;
	private String description;

	@OneToMany(mappedBy = "supperFamille")
	private List<Famille> familles = new ArrayList<>();

	public SupperFamille() {
		super();
		// TODO Auto-generated constructor stub
	}

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getLibelle() {
		return libelle;
	}

	public void setLibelle(String libelle) {
		this.libelle = libelle;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public List<Famille> getFamilles() {
		return familles;
	}

	public void setFamilles(List<Famille> familles) {
		this.familles = familles;
	}

	
	@Override
	public String toString() {
		return "SupperFamille [id=" + id + ", libelle=" + libelle + "]";
	}

}
