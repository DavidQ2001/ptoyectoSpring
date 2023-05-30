package com.example.pruebapersonal.Entidades;

import jakarta.persistence.*;

@Entity
@Table(name="autores")
public class Libro {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="id")
    private Integer id;

    @OneToMany
    @JoinColumn(name="categoria_id")
    private Categoria categoria;

    @OneToMany
    @JoinColumn(name="editorial_id")
    private Editorial editorial;

    @Column(name="titulo")
    private String titulo;

    @Column(name="descripcion")
    private String descripcion;

    @Column(name="favorito")
    private Boolean favorito;

    @OneToOne(mappedBy = "libro",cascade = CascadeType.ALL)

    private InfoAdicional infoAdicional;
}
