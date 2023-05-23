package com.example.pruebapersonal.repositorios;

import com.example.pruebapersonal.entidades.AutorLibro;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AutorLibroRepositorio extends JpaRepository<AutorLibro,Integer> {
}
