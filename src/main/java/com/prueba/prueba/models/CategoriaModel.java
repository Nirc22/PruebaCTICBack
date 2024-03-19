package com.prueba.prueba.models;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

@Entity
@Table(name = "categorias")
public class CategoriaModel {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Getter @Setter @Column(name = "idcategoria")
    private Long idcategoria;

    @Getter @Setter @Column(name = "nombre")
    private String nombre;
}
