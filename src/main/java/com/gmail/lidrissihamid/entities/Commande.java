package com.gmail.lidrissihamid.entities;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Temporal;

@Entity
public class Commande implements Serializable {

	/**
	 * lidrissi Hamid
	 */
	private static final long serialVersionUID = 1L;

	@Id
	private Long id;
	private String commentaire;

	@Temporal(javax.persistence.TemporalType.DATE)
	private Date dateCommande;

	private BigDecimal montantTotal;
	private double tva;

	@ManyToOne
	private Fournisseur fournisseur;

	@OneToMany(mappedBy = "commande")
	private List<CommandeItem> commandesItems = new ArrayList<>();

	public Commande() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getCommentaire() {
		return commentaire;
	}

	public void setCommentaire(String commentaire) {
		this.commentaire = commentaire;
	}

	public Date getDateCommande() {
		return dateCommande;
	}

	public void setDateCommande(Date dateCommande) {
		this.dateCommande = dateCommande;
	}

	public BigDecimal getMontantTotal() {
		return montantTotal;
	}

	public void setMontantTotal(BigDecimal montantTotal) {
		this.montantTotal = montantTotal;
	}

	public double getTva() {
		return tva;
	}

	public void setTva(double tva) {
		this.tva = tva;
	}

	public Fournisseur getFournisseur() {
		return fournisseur;
	}

	public void setFournisseur(Fournisseur fournisseur) {
		this.fournisseur = fournisseur;
	}

	public List<CommandeItem> getCommandesItems() {
		return commandesItems;
	}

	public void setCommandesItems(List<CommandeItem> commandesItems) {
		this.commandesItems = commandesItems;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((id == null) ? 0 : id.hashCode());
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
		Commande other = (Commande) obj;
		if (id == null) {
			if (other.id != null)
				return false;
		} else if (!id.equals(other.id))
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "Commande [id=" + id + ", commentaire=" + commentaire + ", dateCommande=" + dateCommande
				+ ", montantTotal=" + montantTotal + ", tva=" + tva + ", fournisseur=" + fournisseur
				+ ", commandesItems=" + commandesItems + "]";
	}

}
