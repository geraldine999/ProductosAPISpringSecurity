package com.example.productosapispringsecurity.producto;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@Repository
public interface ProductoRepository extends JpaRepository<ProductoEntity, Integer> {

    List<ProductoEntity> findByNombreContaining(String nombre);

}
