package com.gmail.lidrissihamid.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.gmail.lidrissihamid.entities.User;

public interface UserRepository extends  JpaRepository<User, String> {

}
