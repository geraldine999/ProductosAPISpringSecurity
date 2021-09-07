package com.example.productosapispringsecurity.producto;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

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
    public List<ProductoEntity> listarProductos(){
        return productoService.findAll();
    }

    @GetMapping("id/{id_producto}")
    public ProductoEntity listarProductoPorId(@PathVariable Integer id_producto){
        return productoService.findById(id_producto);
    }

    @GetMapping("nombre/{nombre}")
    public List<ProductoEntity> listarProductosQueContenganElNombre(@PathVariable String nombre){
        return productoService.findByNombreContaining(nombre);
    }

    @PostMapping("guardar")
    public void modificarProductoExistente(@RequestBody ProductoEntity productoEntity){
        productoService.save(productoEntity);
    }

    @PutMapping("guardar" )
    public void crearProducto(@RequestBody ProductoEntity productoEntity){
        productoService.save(productoEntity);
    }

    @DeleteMapping("eliminar/id/{id_producto}")
    public void eliminarProductoPorId(@PathVariable Integer id_producto){
        productoService.deleteById(id_producto);
    }





}
