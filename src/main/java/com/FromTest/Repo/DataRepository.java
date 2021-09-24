package com.FromTest.Repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.FromTest.Model.Data;


public interface DataRepository extends JpaRepository<Data, Long> {

}