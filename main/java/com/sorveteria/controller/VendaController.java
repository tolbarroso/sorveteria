package com.sorveteria.controller;

import com.sorveteria.model.Venda;
import com.sorveteria.service.VendaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/vendas")
public class VendaController {

    @Autowired
    private VendaService vendaService;

    @PostMapping
    public Venda criarVenda(@RequestBody Venda venda) {
        return vendaService.salvarVenda(venda);
    }

    @GetMapping
    public List<Venda> listarVendas() {
        return vendaService.listarVendas();
    }

    @GetMapping("/{id}")
    public ResponseEntity<Venda> buscarVendaPorId(@PathVariable Long id) {
        Venda venda = vendaService.buscarVendaPorId(id);
        return ResponseEntity.ok(venda);
    }

    @PutMapping("/{id}")
    public ResponseEntity<Venda> atualizarVenda(@PathVariable Long id, @RequestBody Venda venda) {
        Venda vendaAtualizada = vendaService.atualizarVenda(id, venda);
        return ResponseEntity.ok(vendaAtualizada);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deletarVenda(@PathVariable Long id) {
        vendaService.deletarVenda(id);
        return ResponseEntity.noContent().build();
    }
}
