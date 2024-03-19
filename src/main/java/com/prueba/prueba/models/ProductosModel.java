package com.prueba.prueba.models;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

@Entity
@Table(name = "productos")
public class ProductosModel {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Getter @Setter @Column(name = "idproducto")
    private Long idproducto;

    @Getter @Setter @Column(name = "nombre")
    private String nombre;

    @Getter @Setter @Column(name = "precio")
    private Long precio;

    @Getter @Setter
    @ManyToOne
    @JoinColumn(name = "idcategoria")
    private CategoriaModel idcategoria;

    @Getter @Setter
    @ManyToOne
    @JoinColumn(name = "idproveedor")
    private ProveedorModel idproveedor;
}
