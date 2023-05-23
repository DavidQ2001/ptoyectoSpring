package com.example.pruebapersonal.repositorios;

import com.example.pruebapersonal.entidades.Categoria;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CategoriaRepositorio extends JpaRepository<Categoria,Integer> {
}
