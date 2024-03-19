package com.prueba.prueba.dao;

import com.prueba.prueba.models.ProductosModel;
import com.prueba.prueba.models.ProveedorModel;
import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Repository
@Transactional
public class ProveedorDAOImpl implements ProveedorDAO{

    @PersistenceContext
    private EntityManager entityManager;

    @Override
    public List<ProveedorModel> getProveedores() {
        String query = "FROM wea";
        return entityManager.createQuery(query).getResultList();
    }
}
