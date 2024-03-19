package com.prueba.prueba.controllers;

import com.prueba.prueba.Repository.CategoriaRepository;
import com.prueba.prueba.dao.CategoriaDAO;
import com.prueba.prueba.dao.ProductoDAO;
import com.prueba.prueba.models.CategoriaModel;
import com.prueba.prueba.models.ProductosModel;
import com.prueba.prueba.models.ProveedorModel;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class CategoriaController {

    @Autowired
    private CategoriaRepository categoriaRepository;

    /*@Autowired
    private CategoriaDAO categoriaDAO;

    @RequestMapping(value = "api/getCategorias", method = RequestMethod.GET)
    public List<CategoriaModel> getCategorias(){
        return categoriaDAO.getCategorias();
    }

    @RequestMapping(value = "api/crearCategoria", method = RequestMethod.POST)
    public void crearCategoria(@RequestBody CategoriaModel categoriaModel){
        categoriaDAO.crearCategoria(categoriaModel);
    }*/

    @GetMapping("api/getCategorias")
    public List<CategoriaModel> getCategorias(){
        return categoriaRepository.findAll();
    }

    @PostMapping("api/crearCategoria")
    public String crearCategoria(@RequestBody CategoriaModel categoriaModel){
        categoriaRepository.save(categoriaModel);
        return "Grabado";
    }
}
