package com.gmail.lidrissihamid.entities;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Temporal;

@Entity
public class Demande implements Serializable {

	/**
	 * Lidrissi Hamid
	 */
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	private String commentaire;

	@Temporal(javax.persistence.TemporalType.DATE)
	private Date dateDemande;

	private BigDecimal montantTotal;
	private double tva;

	@ManyToOne
	private Client client;

	@OneToMany(mappedBy = "demande")
	private List<DemandeItem> demandeItems = new ArrayList<>();

	public Demande() {
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

	public Date getDateDemande() {
		return dateDemande;
	}

	public void setDateDemande(Date dateDemande) {
		this.dateDemande = dateDemande;
	}

	public Client getClient() {
		return client;
	}

	public void setClient(Client client) {
		this.client = client;
	}

	public List<DemandeItem> getDemandeItems() {
		return demandeItems;
	}

	public void setDemandeItems(List<DemandeItem> demandeItems) {
		this.demandeItems = demandeItems;
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
		Demande other = (Demande) obj;
		if (id == null) {
			if (other.id != null)
				return false;
		} else if (!id.equals(other.id))
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "Demande [id=" + id + ", commentaire=" + commentaire + ", dateDemande=" + dateDemande + ", montantTotal="
				+ montantTotal + ", tva=" + tva + ", client=" + client + ", demandeItems=" + demandeItems + "]";
	}

}
