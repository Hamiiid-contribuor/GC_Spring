package com.gmail.lidrissihamid.entities;

import java.io.Serializable;
import java.math.BigDecimal;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

@Entity
public class DemandeItem implements Serializable {

	/**
	 * Lidrissi Hamid
	 */
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	private BigDecimal qteRecu;

	@ManyToOne
	private Produit produit;
	@ManyToOne
	private Demande demande;

	public DemandeItem() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public BigDecimal getQteRecu() {
		return qteRecu;
	}

	public void setQteRecu(BigDecimal qteRecu) {
		this.qteRecu = qteRecu;
	}

	public Produit getProduit() {
		return produit;
	}

	public void setProduit(Produit produit) {
		this.produit = produit;
	}

	public Demande getDemande() {
		return demande;
	}

	public void setDemande(Demande demande) {
		this.demande = demande;
	}

	@Override
	public String toString() {
		return "DemandeItem [id=" + id + ", qteRecu=" + qteRecu + ", produit=" + produit + ", demande=" + demande + "]";
	}

}
