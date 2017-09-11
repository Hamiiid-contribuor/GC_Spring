package com.gmail.lidrissihamid.entities ; 


import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;

@Entity
public class Famille implements Serializable {

	/**
	 * Lidrissi Hamid
	 */
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;

	private String libelle;
	private String description;

	@ManyToOne
	private SupperFamille supperFamille;

	@OneToMany(mappedBy = "famille")
	private List<Produit> produits = new ArrayList<>();

	public Famille() {
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

	public SupperFamille getSupperFamille() {
		return supperFamille;
	}

	public void setSupperFamille(SupperFamille supperFamille) {
		this.supperFamille = supperFamille;
	}

	public List<Produit> getProduits() {
		return produits;
	}

	public void setProduits(List<Produit> produits) {
		this.produits = produits;
	}
	
	

	@Override
	public String toString() {
		return "Famille [id=" + id + ", libelle=" + libelle + "]";
	}

}
