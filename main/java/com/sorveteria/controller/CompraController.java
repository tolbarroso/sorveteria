package com.sorveteria.controller;

import com.sorveteria.model.Compra;
import com.sorveteria.service.CompraService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/compras")
public class CompraController {

    @Autowired
    private CompraService compraService;

    @PostMapping
    public Compra criarCompra(@RequestBody Compra compra) {
        return compraService.salvarCompra(compra);
    }

    @GetMapping
    public List<Compra> listarCompras() {
        return compraService.listarCompras();
    }

    @GetMapping("/{id}")
    public ResponseEntity<Compra> buscarCompraPorId(@PathVariable Long id) {
        Compra compra = compraService.buscarCompraPorId(id);
        return ResponseEntity.ok(compra);
    }

    @PutMapping("/{id}")
    public ResponseEntity<Compra> atualizarCompra(@PathVariable Long id, @RequestBody Compra compra) {
        Compra compraAtualizada = compraService.atualizarCompra(id, compra);
        return ResponseEntity.ok(compraAtualizada);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deletarCompra(@PathVariable Long id) {
        compraService.deletarCompra(id);
        return ResponseEntity.noContent().build();
    }
}
