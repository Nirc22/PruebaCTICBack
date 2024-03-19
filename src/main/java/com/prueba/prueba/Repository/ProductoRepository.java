package com.prueba.prueba.Repository;

import com.prueba.prueba.models.ProductosModel;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductoRepository extends JpaRepository <ProductosModel, Long> {
}
