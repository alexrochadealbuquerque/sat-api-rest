package com.br.sat.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.br.sat.domain.User;

@Repository
public interface UserRepository extends JpaRepository<User, Integer> {

}
