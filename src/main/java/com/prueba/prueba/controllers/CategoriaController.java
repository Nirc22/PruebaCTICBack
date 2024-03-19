package com.prueba.prueba.controllers;

import com.prueba.prueba.dao.CategoriaDAO;
import com.prueba.prueba.dao.ProductoDAO;
import com.prueba.prueba.models.CategoriaModel;
import com.prueba.prueba.models.ProductosModel;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class CategoriaController {

    @Autowired
    private CategoriaDAO categoriaDAO;

    @RequestMapping(value = "api/getCategorias", method = RequestMethod.GET)
    public List<CategoriaModel> getCategorias(){
        return categoriaDAO.getCategorias();
    }

    @RequestMapping(value = "api/crearCategoria", method = RequestMethod.POST)
    public void crearCategoria(@RequestBody CategoriaModel categoriaModel){
        categoriaDAO.crearCategoria(categoriaModel);
    }
}
