package com.mylovelyservers.mylovelyservers.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.mylovelyservers.mylovelyservers.Entity.master;

import java.util.List;

@Repository
public interface ImasterRepository extends JpaRepository<master,String>{
    List<master> findByTarget(String target);
}