package com.example.productosapispringsecurity.producto;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("api/productos")
public class ProductoController {

    private final ProductoService productoService;

    @Autowired
    public ProductoController(ProductoService productoService) {
        this.productoService = productoService;
    }

    @GetMapping
    public List<String> encontrarNombreProductos(){
        return productoService.findNames();
    }

    @GetMapping("detalles")
    public List<ProductoEntity> encontrarProductos(){
        return productoService.findAll();
    }
}
