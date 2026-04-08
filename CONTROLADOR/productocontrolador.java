package com.movilfour.controlador;

import com.movilfour.modelo.Producto;
import com.movilfour.servicio.ProductoServicio;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/productos")
public class ProductoControlador {

    @Autowired
    private ProductoServicio productoServicio;

    @GetMapping
    public List<Producto> listarProductos() {
        return productoServicio.listarProductos();
    }

    @PostMapping
    public Producto crearProducto(@RequestBody Producto producto) {
        return productoServicio.guardarProducto(producto);
    }

    @GetMapping("/{nombre}")
    public Producto buscarPorNombre(@PathVariable String nombre) {
        return productoServicio.buscarPorNombre(nombre);
    }

    @DeleteMapping("/{id}")
    public void eliminarProducto(@PathVariable Long id) {
        productoServicio.eliminarProducto(id);
    }
}
