package com.movilfour.servicio;

import com.movilfour.modelo.Producto;
import com.movilfour.repositorio.ProductoRepositorio;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProductoServicio {

    @Autowired
    private ProductoRepositorio productoRepositorio;

    public List<Producto> listarProductos() {
        return productoRepositorio.findAll();
    }

    public Producto guardarProducto(Producto producto) {
        return productoRepositorio.save(producto);
    }

    public Producto buscarPorNombre(String nombre) {
        return productoRepositorio.findByNombre(nombre);
    }

    public void eliminarProducto(Long id) {
        productoRepositorio.deleteById(id);
    }
}
