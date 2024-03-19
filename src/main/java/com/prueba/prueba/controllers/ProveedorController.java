package com.prueba.prueba.controllers;

import com.prueba.prueba.Repository.ProveedorRepository;
import com.prueba.prueba.dao.ProveedorDAO;
import com.prueba.prueba.models.ProveedorModel;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class ProveedorController {

    @Autowired
    private ProveedorDAO proveedorDAO;

    @Autowired
    private ProveedorRepository proveedorRepository;

    /*@RequestMapping(value = "api/getProveedores", method = RequestMethod.GET)
    public List<ProveedorModel> getProveedores(){
        return proveedorDAO.getProveedores();
    }*/

    @GetMapping("api/getProveedores")
    public List<ProveedorModel> getProveedor(){
        return proveedorRepository.findAll();
    }

    @PostMapping("api/crearProveedor")
    public String crearProveedor(@RequestBody ProveedorModel proveedorModel){
        proveedorRepository.save(proveedorModel);
        return "Grabado";
    }


}
