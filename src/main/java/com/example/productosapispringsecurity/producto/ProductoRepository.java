package com.example.productosapispringsecurity.producto;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import org.springframework.web.bind.annotation.RequestMapping;

@Repository

public interface ProductoRepository extends JpaRepository<ProductoEntity, Integer> {
}
