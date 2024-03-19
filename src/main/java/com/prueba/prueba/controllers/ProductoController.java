package com.prueba.prueba.controllers;

import com.prueba.prueba.dao.ProductoDAO;
import com.prueba.prueba.models.ProductosModel;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class ProductoController {

    @Autowired
    private ProductoDAO productoDAO;

    @RequestMapping(value = "api/getProductos", method = RequestMethod.GET)
    public List<ProductosModel> getProductos(){
        return productoDAO.getProductos();
    }

    @RequestMapping(value = "api/crearProducto", method = RequestMethod.POST)
    public void crearProducto(@RequestBody ProductosModel productosModel){
        productoDAO.crearProducto(productosModel);
    }
}
