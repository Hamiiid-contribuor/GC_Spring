package com.gmail.lidrissihamid.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import com.gmail.lidrissihamid.entities.Client;

import  java.util.List;

public interface ClientRepository extends JpaRepository<Client, String>{

	
	public Client findByMatricule(String matricule);
	
	@Query("SELECT c FROM Client c WHERE c.matricule  like :mat AND c.nom LIKE :nom AND c.tel LIKE :tel")
	public List<Client> SearshByCretaria(@Param(value="mat") String matricule   , @Param(value="nom")  String nom  , @Param(value="tel") String tel );
		
	
}
