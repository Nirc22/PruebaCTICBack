package com.prueba.prueba.controllers;

import com.prueba.prueba.Repository.ProductoRepository;
import com.prueba.prueba.dao.ProductoDAO;
import com.prueba.prueba.models.CategoriaModel;
import com.prueba.prueba.models.ProductosModel;
import com.prueba.prueba.models.ProveedorModel;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class ProductoController {

    @Autowired
    private ProductoRepository productoRepository;

    @GetMapping("api/getProductos")
    public List<ProductosModel> getProductos(){
        return productoRepository.findAll();
    }

    @PostMapping("api/crearProducto")
    public String crearProducto(@RequestBody ProductosModel productosModel){
        productoRepository.save(productosModel);
        return "Grabado";
    }

    @PutMapping("api/actualizarProducto/{id}")
    public void actualizarProducto(@PathVariable Long id, @RequestBody ProductosModel productosModel){
        ProductosModel updateProductoModel = productoRepository.findById(id).get();
        updateProductoModel.setNombre(productosModel.getNombre());
        updateProductoModel.setPrecio(productosModel.getPrecio());
        updateProductoModel.setIdcategoria(productosModel.getIdcategoria());
        updateProductoModel.setIdproveedor(productosModel.getIdproveedor());
        productoRepository.save(updateProductoModel);
    }

    @DeleteMapping("api/eliminarProducto/{id}")
    public void eliminarProducto(@PathVariable Long id){
        ProductosModel deleteProductoModel = productoRepository.findById(id).get();
        productoRepository.delete(deleteProductoModel);
    }
}
