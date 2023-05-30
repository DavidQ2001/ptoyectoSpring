package com.example.pruebapersonal.controladores;

import com.example.pruebapersonal.Entidades.Autor;
import com.example.pruebapersonal.entidades.Autor;
import com.example.pruebapersonal.servicios.ServicioAutor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("api/v1/autores")
public class AutorControlador {

    @Autowired
    public ServicioAutor servicioAutor;

    //llamando al servicio para ingresar un autor
    public ResponseEntity<Autor> registrar(@RequestBody Autor datosAutor){
        try{
            Autor autorRegistrado=servicioAutor.registrar(datosAutor);
            return ResponseEntity
                    .status(HttpStatus.CREATED)
                    .body(autorRegistrado);
        }catch(Exception error){
            String mensaje="Tenemos problemas "+error.getMessage();
            Autor autor = new Autor();
            autor.setMensajeError(mensaje);
            return ResponseEntity
                    .status(HttpStatus.BAD_REQUEST)
                    .body(autor);
        }
    }


}
