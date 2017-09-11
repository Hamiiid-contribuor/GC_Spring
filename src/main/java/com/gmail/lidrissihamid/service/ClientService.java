package com.gmail.lidrissihamid.service;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.gmail.lidrissihamid.entities.Client;
import com.gmail.lidrissihamid.repositories.ClientRepository;
import com.gmail.lidrissihamid.services.interfaces.ClientServiceInterface;

@Service
@Transactional
public class ClientService implements ClientServiceInterface {

	@PersistenceContext
	public EntityManager em;

	@Autowired
	public ClientRepository clientRepository;

	@Override
	public void addClient(Client client) {
		clientRepository.save(client);

	}

	@Override
	public void deleteClient(String matricule) {
		clientRepository.delete(matricule);

	}

	@Override
	public void editClient(Client client) {
		clientRepository.save(client);
	}

	@Override
	public List<Client> getClients() {
		return clientRepository.findAll();
	}

	@Override
	public Client findByMatricule(String matricule) {
		return clientRepository.findByMatricule(matricule);
	}

	@Override
	public List<Client> searchClients(Client client) {

		String requette = "SELECT  c FROM  Client c WHERE 1=1";
		if (!client.getMatricule().equals("") && client.getMatricule() != null) {
			requette += " AND c.matricule like '" + client.getMatricule() + "'";
		}
		if (!client.getNom().equals("") && client.getNom() != null) {
			requette += " AND c.nom like '" + client.getNom() + "'";
		}
		if (!client.getTel().equals("") && client.getTel() != null) {
			requette += " AND c.tel like '" + client.getTel() + "'";
		}
		return em.createQuery(requette).getResultList();
	}

}
