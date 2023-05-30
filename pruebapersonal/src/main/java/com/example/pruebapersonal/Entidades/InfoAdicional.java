package com.example.pruebapersonal.Entidades;

import jakarta.persistence.*;

@Entity
@Table(name="infoadicional")
public class InfoAdicional {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="id")
    private Integer id;

    @OneToOne
    @JoinColumn(name="id_libro")
    private Libro libro;

    @Column(name="idioma")
    private String idioma;

    @Column(name="fecha")
    private String fecha;
}
