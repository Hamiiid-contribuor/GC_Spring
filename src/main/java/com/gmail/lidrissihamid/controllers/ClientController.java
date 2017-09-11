package com.gmail.lidrissihamid.controllers;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.gmail.lidrissihamid.entities.Client;
import com.gmail.lidrissihamid.repositories.ClientRepository;
import com.gmail.lidrissihamid.services.interfaces.ClientServiceInterface;

@RestController
public class ClientController {

	@Autowired
	public ClientRepository clientRepository;

	@Autowired
	public ClientServiceInterface clientServiceInterface;

	
	
	
	@RequestMapping(value = "/client/add", method = RequestMethod.POST)
	public void addClient(@RequestBody Client client) {
		clientRepository.save(client);
	}

	@RequestMapping(value = "/client/all", method = RequestMethod.GET)
	public List<Client> getClients() {
		System.out.println("je  suis au sein de la methode findAllCLients");
		return clientRepository.findAll();
	}

	@RequestMapping(value = "/client/delete/{matricule}", method = RequestMethod.GET)
	public void deleteClient(@PathVariable String matricule) {
		System.out.println("j'ai apelle la methode delete  :) ");
		clientRepository.delete(matricule);
	}

	@RequestMapping(value = "/client/edit", method = RequestMethod.POST)
	public Client editClient(@RequestBody Client client) {
		return clientRepository.save(client);
	}

	@RequestMapping(value = "/client/findByMatricule/{matricule}", method = RequestMethod.GET)
	public Client findByMatricule(@PathVariable String matricule) {
		return clientServiceInterface.findByMatricule(matricule);
	}

	@RequestMapping(value = "/client/search", method = RequestMethod.POST)
	public List<Client> searchByCretaria(@RequestBody Client client) {
		System.out.println("je suis  en tant  que  compilateur au sein de la methode  searsh :) ");
		return clientRepository.SearshByCretaria(client.getMatricule(), client.getNom(), client.getTel());
	}
	
	@RequestMapping(value = "/client/searchClients", method = RequestMethod.POST)
	public List<Client> searchClients(@RequestBody Client client) {
		System.out.println(" toutes est en ordre :)");
		System.out.println("voila les parametres  recus  matricule -->"+client.getMatricule() +" nom ---> "+client.getNom() +" tel --> "+client.getTel()+ "");
		//return null; 
		return clientServiceInterface.searchClients(client);
	}

}
