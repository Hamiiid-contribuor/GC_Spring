package com.gmail.lidrissihamid.entities ; 
import java.io.Serializable;
import java.math.BigDecimal;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity(name="Produit")
@Table(name="produit")
public class Produit implements Serializable {

	/**
	 * Lidrissi Hamid
	 */
	private static final long serialVersionUID = 1L;

	@Id
	private String reference;
	private String libelle;
	private Double prix;
	private BigDecimal qteGlobalStock;

	private int seuilAlert;

	@ManyToOne
	private Famille famille;

	@ManyToOne
	private UniteMesure uniteMesure;

	public Produit() {
		super();
		// TODO Auto-generated constructor stub
	}

	public String getReference() {
		return reference;
	}

	public void setReference(String reference) {
		this.reference = reference;
	}

	public String getLibelle() {
		return libelle;
	}

	public void setLibelle(String libelle) {
		this.libelle = libelle;
	}

	public Double getPrix() {
		return prix;
	}

	public void setPrix(Double prix) {
		this.prix = prix;
	}

	public BigDecimal getQteGlobalStock() {
		return qteGlobalStock;
	}

	public void setQteGlobalStock(BigDecimal qteGlobalStock) {
		this.qteGlobalStock = qteGlobalStock;
	}

	public int getSeuilAlert() {
		return seuilAlert;
	}

	public void setSeuilAlert(int seuilAlert) {
		this.seuilAlert = seuilAlert;
	}

	public Famille getFamille() {
		return famille;
	}

	public void setFamille(Famille famille) {
		this.famille = famille;
	}

	public UniteMesure getUniteMesure() {
		return uniteMesure;
	}

	public void setUniteMesure(UniteMesure uniteMesure) {
		this.uniteMesure = uniteMesure;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((reference == null) ? 0 : reference.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Produit other = (Produit) obj;
		if (reference == null) {
			if (other.reference != null)
				return false;
		} else if (!reference.equals(other.reference))
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "Produit [reference=" + reference + ", libelle=" + libelle + ", prix=" + prix + ", qteGlobalStock="
				+ qteGlobalStock + ", seuilAlert=" + seuilAlert + ", famille=" + famille + ", uniteMesure="
				+ uniteMesure + "]";
	}

}
