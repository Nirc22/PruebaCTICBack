package com.prueba.prueba.controllers;

import com.prueba.prueba.dao.ProveedorDAO;
import com.prueba.prueba.models.ProveedorModel;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class ProveedorController {

    @Autowired
    private ProveedorDAO proveedorDAO;

    @RequestMapping(value = "api/getProveedores", method = RequestMethod.GET)
    public List<ProveedorModel> getProveedores(){
        return proveedorDAO.getProveedores();
    }
}
