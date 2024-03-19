package com.prueba.prueba.controllers;

import com.prueba.prueba.Repository.ProveedorRepository;
import com.prueba.prueba.dao.ProveedorDAO;
import com.prueba.prueba.models.CategoriaModel;
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

    @PutMapping("api/actualizarProveedor/{id}")
    public void actualizarProveedor(@PathVariable Long id, @RequestBody ProveedorModel proveedorModel){
        ProveedorModel updateProveedorModel = proveedorRepository.findById(id).get();
        updateProveedorModel.setNombre(proveedorModel.getNombre());
        updateProveedorModel.setTelefono(proveedorModel.getTelefono());
        proveedorRepository.save(updateProveedorModel);
    }

    @DeleteMapping("api/eliminarProveedor/{id}")
    public void eliminarProveedor(@PathVariable Long id){
        ProveedorModel deleteProveedorModel = proveedorRepository.findById(id).get();
        proveedorRepository.delete(deleteProveedorModel);
    }


}
