package com.prueba.prueba.dao;

import com.prueba.prueba.models.ProductosModel;
import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Repository
@Transactional
public class ProductoDAOImpl implements ProductoDAO {

    @PersistenceContext
    private EntityManager entityManager;

    @Override
    public List<ProductosModel> getProductos() {
        String query = "FROM productos";
        return entityManager.createQuery(query).getResultList();
    }

    @Override
    public void crearProducto(ProductosModel productoModel) {
        entityManager.merge(productoModel);
    }
}
