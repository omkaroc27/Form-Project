package com.FromTest.Repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.FromTest.Model.User;

public interface UserRepository extends JpaRepository<User, String> {

}