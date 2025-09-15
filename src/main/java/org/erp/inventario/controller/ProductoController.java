package org.erp.inventario.controller;

import org.erp.inventario.model.Producto;
import org.erp.inventario.repository.ProductoRepository;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/inventario")
public class ProductoController {

    private final ProductoRepository repo;

    public ProductoController(ProductoRepository repo) {
        this.repo = repo;
    }

    @GetMapping
    public List<Producto> listar() {
        return repo.findAll();
    }

    @PostMapping
    public Producto agregar(@RequestBody Producto producto) {
        return repo.save(producto);
    }
}
