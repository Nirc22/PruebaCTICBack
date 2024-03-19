package com.prueba.prueba.dao;

import com.prueba.prueba.models.CategoriaModel;
import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;


@Repository
@Transactional
public class CategoriaDAOImpl implements CategoriaDAO{

    @PersistenceContext
    private EntityManager entityManager;
    @Override
    public List<CategoriaModel> getCategorias() {
        String query = "FROM categorias";
        return entityManager.createQuery(query).getResultList();
    }

    @Override
    public void crearCategoria(CategoriaModel categoriaModel) {
        entityManager.merge((categoriaModel));
    }
}
