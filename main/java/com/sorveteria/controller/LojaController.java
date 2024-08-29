package com.sorveteria.controller;

import com.sorveteria.model.Loja;
import com.sorveteria.service.LojaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/lojas")
public class LojaController {

    @Autowired
    private LojaService lojaService;

    @PostMapping
    public Loja criarLoja(@RequestBody Loja loja) {
        return lojaService.salvarLoja(loja);
    }

    @GetMapping
    public List<Loja> listarLojas() {
        return lojaService.listarLojas();
    }

    @GetMapping("/{id}")
    public ResponseEntity<Loja> buscarLojaPorId(@PathVariable Long id) {
        Loja loja = lojaService.buscarLojaPorId(id);
        return ResponseEntity.ok(loja);
    }

    @PutMapping("/{id}")
    public ResponseEntity<Loja> atualizarLoja(@PathVariable Long id, @RequestBody Loja loja) {
        Loja lojaAtualizada = lojaService.atualizarLoja(id, loja);
        return ResponseEntity.ok(lojaAtualizada);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deletarLoja(@PathVariable Long id) {
        lojaService.deletarLoja(id);
        return ResponseEntity.noContent().build();
    }
}
