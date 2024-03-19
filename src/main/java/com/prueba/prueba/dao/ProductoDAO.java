package com.prueba.prueba.dao;

import com.prueba.prueba.models.ProductosModel;

import java.util.List;

public interface ProductoDAO {

    List<ProductosModel> getProductos();

    void crearProducto(ProductosModel productoModel);

}
