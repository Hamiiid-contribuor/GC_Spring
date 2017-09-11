package com.gmail.lidrissihamid.entities;

import java.io.Serializable;
import javax.persistence.Table;
import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

@Entity(name="User")
@Table(name="user")
public class User implements Serializable {

	/**
	 * Lidrissi Hamid
	 */
	private static final long serialVersionUID = 1L;

	@Id
	protected String login;
	protected String password;
	protected String nom;
	protected String prenom;

	protected String tel;
	protected String email;

	protected int blocked;
	@Temporal(TemporalType.DATE)
	protected Date dateCreation;

	private String role;

	public User() {
		super();
	}

	public String getLogin() {
		return login;
	}

	public void setLogin(String login) {
		this.login = login;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getNom() {
		return nom;
	}

	public void setNom(String nom) {
		this.nom = nom;
	}

	public String getPrenom() {
		return prenom;
	}

	public void setPrenom(String prenom) {
		this.prenom = prenom;
	}

	public String getTel() {
		return tel;
	}

	public void setTel(String tel) {
		this.tel = tel;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public int getBlocked() {
		return blocked;
	}

	public void setBlocked(int blocked) {
		this.blocked = blocked;
	}

	public Date getDateCreation() {
		return dateCreation;
	}

	public void setDateCreation(Date dateCreation) {
		this.dateCreation = dateCreation;
	}

	public static long getSerialversionuid() {
		return serialVersionUID;
	}

	public String getRole() {
		return role;
	}

	public void setRole(String role) {
		this.role = role;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((login == null) ? 0 : login.hashCode());
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
		User other = (User) obj;
		if (login == null) {
			if (other.login != null)
				return false;
		} else if (!login.equals(other.login))
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "User [login=" + login + ", password=" + password + ", nom=" + nom + ", prenom=" + prenom + ", tel="
				+ tel + ", email=" + email + "]";
	}

}
