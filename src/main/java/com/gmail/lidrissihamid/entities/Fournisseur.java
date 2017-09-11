package com.gmail.lidrissihamid.entities;

import java.io.Serializable;

import javax.persistence.Entity;

import javax.persistence.Id;

@Entity
public class Fournisseur implements Serializable {

	/**
	 * Lidrissi Hamid
	 */
	private static final long serialVersionUID = 1L;

	public Fournisseur() {
		super();
		// TODO Auto-generated constructor stub
	}

	@Id
	private String matricule;
	private String nom;
	private String adresse;
	private String gmail;
	private String tel;

	private String logo; // if the client is a entreprise
	private String photo; // if the client is a person

	public String getMatricule() {
		return matricule;
	}

	public void setMatricule(String matricule) {
		this.matricule = matricule;
	}

	public String getNom() {
		return nom;
	}

	public void setNom(String nom) {
		this.nom = nom;
	}

	public String getAdresse() {
		return adresse;
	}

	public void setAdresse(String adresse) {
		this.adresse = adresse;
	}

	public String getGmail() {
		return gmail;
	}

	public void setGmail(String gmail) {
		this.gmail = gmail;
	}

	public String getTel() {
		return tel;
	}

	public void setTel(String tel) {
		this.tel = tel;
	}

	public String getLogo() {
		return logo;
	}

	public void setLogo(String logo) {
		this.logo = logo;
	}

	public String getPhoto() {
		return photo;
	}

	public void setPhoto(String photo) {
		this.photo = photo;
	}

	@Override
	public String toString() {
		return "Fournisseur [matricule=" + matricule + ", nom=" + nom + ", adresse=" + adresse + ", gmail=" + gmail
				+ ", tel=" + tel + ", logo=" + logo + ", photo=" + photo + "]";
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = super.hashCode();
		result = prime * result + ((gmail == null) ? 0 : gmail.hashCode());
		result = prime * result + ((matricule == null) ? 0 : matricule.hashCode());
		result = prime * result + ((nom == null) ? 0 : nom.hashCode());
		result = prime * result + ((tel == null) ? 0 : tel.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (!super.equals(obj))
			return false;
		if (getClass() != obj.getClass())
			return false;
		Fournisseur other = (Fournisseur) obj;
		if (gmail == null) {
			if (other.gmail != null)
				return false;
		} else if (!gmail.equals(other.gmail))
			return false;
		if (matricule == null) {
			if (other.matricule != null)
				return false;
		} else if (!matricule.equals(other.matricule))
			return false;
		if (nom == null) {
			if (other.nom != null)
				return false;
		} else if (!nom.equals(other.nom))
			return false;
		if (tel == null) {
			if (other.tel != null)
				return false;
		} else if (!tel.equals(other.tel))
			return false;
		return true;
	}

}
