package com.example.pruebapersonal.repositorios;

import com.example.pruebapersonal.entidades.Autor;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AutorRepositorio extends JpaRepository<Autor,Integer> {
}
