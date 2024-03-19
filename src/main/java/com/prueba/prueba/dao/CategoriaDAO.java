package com.prueba.prueba.dao;

import com.prueba.prueba.models.CategoriaModel;
import com.prueba.prueba.models.ProductosModel;

import java.util.List;

public interface CategoriaDAO {

    List<CategoriaModel> getCategorias();

    void crearCategoria(CategoriaModel categoriaModel);


}
