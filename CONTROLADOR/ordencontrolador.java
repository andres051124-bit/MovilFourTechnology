package com.movilfour.controlador;

import com.movilfour.modelo.Orden;
import com.movilfour.servicio.OrdenServicio;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/ordenes")
public class OrdenControlador {

    @Autowired
    private OrdenServicio ordenServicio;

    @GetMapping
    public List<Orden> listarOrdenes() {
        return ordenServicio.listarOrdenes();
    }

    @PostMapping
    public Orden crearOrden(@RequestBody Orden orden) {
        return ordenServicio.guardarOrden(orden);
    }

    @GetMapping("/{id}")
    public Orden buscarOrden(@PathVariable Long id) {
        return ordenServicio.buscarOrden(id);
    }

    @DeleteMapping("/{id}")
    public void eliminarOrden(@PathVariable Long id) {
        ordenServicio.eliminarOrden(id);
    }
}
