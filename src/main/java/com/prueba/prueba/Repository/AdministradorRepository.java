package com.prueba.prueba.Repository;

import com.prueba.prueba.models.RafAdministradoresModel;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface AdministradorRepository extends JpaRepository<RafAdministradoresModel, Integer> {
    Optional<RafAdministradoresModel> findOneByEmail(String email);

}
