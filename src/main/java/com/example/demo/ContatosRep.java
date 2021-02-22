package com.example.demo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.mapping.*;
import org.springframework.stereotype.Repository;

import com.example.demo.Contatos;

@Repository
public interface ContatosRep extends JpaRepository<Contatos, Long>{}


