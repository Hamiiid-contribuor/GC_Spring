package com.gmail.lidrissihamid.services.interfaces;

import java.util.List;

import com.gmail.lidrissihamid.entities.Client;

public interface ClientServiceInterface {

	public void addClient(Client client);

	public void deleteClient(String matricule);

	public void editClient(Client client);

	public List<Client> getClients();
	
	public Client findByMatricule(String matricule);

	public List<Client> searchClients(Client client);
}
