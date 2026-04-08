package com.movilfour.servicio;

import com.movilfour.modelo.Orden;
import com.movilfour.repositorio.OrdenRepositorio;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class OrdenServicio {

    @Autowired
    private OrdenRepositorio ordenRepositorio;

    public List<Orden> listarOrdenes() {
        return ordenRepositorio.findAll();
    }

    public Orden guardarOrden(Orden orden) {
        return ordenRepositorio.save(orden);
    }

    public Orden buscarOrden(Long id) {
        return ordenRepositorio.findById(id).orElse(null);
    }

    public void eliminarOrden(Long id) {
        ordenRepositorio.deleteById(id);
    }
}
