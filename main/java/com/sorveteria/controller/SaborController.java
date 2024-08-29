package com.sorveteria.controller;

import com.sorveteria.model.Sabor;
import com.sorveteria.service.SaborService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/sabores")
public class SaborController {

    @Autowired
    private SaborService saborService;

    @PostMapping
    public Sabor criarSabor(@RequestBody Sabor sabor) {
        return saborService.salvarSabor(sabor);
    }

    @GetMapping
    public List<Sabor> listarSabores() {
        return saborService.listarSabores();
    }

    @GetMapping("/{id}")
    public ResponseEntity<Sabor> buscarSaborPorId(@PathVariable Long id) {
        Sabor sabor = saborService.buscarSaborPorId(id);
        return ResponseEntity.ok(sabor);
    }

    @PutMapping("/{id}")
    public ResponseEntity<Sabor> atualizarSabor(@PathVariable Long id, @RequestBody Sabor sabor) {
        Sabor saborAtualizado = saborService.atualizarSabor(id, sabor);
        return ResponseEntity.ok(saborAtualizado);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deletarSabor(@PathVariable Long id) {
        saborService.deletarSabor(id);
        return ResponseEntity.noContent().build();
    }
}
