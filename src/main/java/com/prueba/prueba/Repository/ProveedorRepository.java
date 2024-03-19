package com.prueba.prueba.Repository;

import com.prueba.prueba.models.ProveedorModel;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProveedorRepository extends JpaRepository<ProveedorModel, Long> {
}
