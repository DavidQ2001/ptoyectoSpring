package com.example.pruebapersonal.servicios;

import com.example.pruebapersonal.entidades.Autor;
import com.example.pruebapersonal.repositorios.AutorRepositorio;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ServicioAutor implements ServicioBase<Autor> {

    @Autowired
    private AutorRepositorio autorRepositorio;

    @Override
    public List<Autor> buscarTodos() throws Exception {

        try {
            List<Autor> autores = autorRepositorio.findAll();
            return autores;

        } catch (Exception error) {
            throw new Exception(error.getMessage());
        }
    }

    @Override
    public Autor buscarId(Integer id) throws Exception {


        try {
            Optional<Autor> autorOptional = autorRepositorio.findById(id);
            if (autorOptional.isPresent()) {
                Autor autor = autorOptional.get();
                return autor;

            } else {
                throw new Exception("el autor buscado no existe " + id);
            }
        } catch (Exception error) {
            throw new Exception(error.getMessage());
        }
    }

    @Override
    public Autor registrar(Autor datosEntidad) throws Exception {
        try {
            Autor autorguardado = autorRepositorio.save(datosEntidad);
            return autorguardado;
        } catch (Exception error) {
            throw new Exception(error.getMessage());
        }
    }


    @Override
    public Autor actualizar(Integer id, Autor datosEntidadNuevos) throws Exception {
        try {
            Optional<Autor> autorOptional = autorRepositorio.findById(id);
            if (autorOptional.isPresent()) {
                //filtrar datos a actualizar
                Autor autorExistente = autorOptional.get();
                autorExistente.setNombre(datosEntidadNuevos.getNombre());
                Autor autorActualizado = autorRepositorio.save(autorExistente);
                return autorActualizado;

            } else {
                throw new Exception("El autor buscando no existe " + id);
            }
        } catch (Exception error) {
            throw new Exception(error.getMessage());
        }
    }


    @Override
    public boolean eliminar(Integer id) throws Exception {
        try {

            Optional<Autor> autorOptional = autorRepositorio.findById(id);
            if (autorOptional.isPresent()) {
                autorRepositorio.deleteById(id);
                return true;
            }else{
                throw new Exception("El autor buscando no existe " + id);
            }
        } catch (Exception error) {
            throw new Exception(error.getMessage());
        }
    }
}


