package com.example.pruebapersonal.repositorios;

import com.example.pruebapersonal.entidades.Libro;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface LibroRepositorio extends JpaRepository<Libro,Integer> {
}
