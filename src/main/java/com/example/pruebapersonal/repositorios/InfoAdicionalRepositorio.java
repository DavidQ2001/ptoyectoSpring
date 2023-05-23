package com.example.pruebapersonal.repositorios;

import com.example.pruebapersonal.entidades.InfoAdicional;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface InfoAdicionalRepositorio extends JpaRepository<InfoAdicional,Integer> {
}
