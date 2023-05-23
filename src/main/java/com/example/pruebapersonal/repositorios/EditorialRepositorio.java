package com.example.pruebapersonal.repositorios;

import com.example.pruebapersonal.entidades.Editorial;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface EditorialRepositorio extends JpaRepository<Editorial,Integer> {
}
