package com.example.pruebapersonal.servicios;

import java.util.List;

public interface ServicioBase<E> {

    public List<E> buscarTodos() throws Exception;
    public E buscarId(Integer id) throws Exception;
    public E registrar(E datosEntidad) throws Exception;
    public E actualizar(Integer id, E datosEntidadNuevos) throws Exception;
    public boolean eliminar(Integer id) throws  Exception;


}
