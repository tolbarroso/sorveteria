package com.sorveteria.service;

import com.sorveteria.entity.Venda;
import com.sorveteria.repository.VendaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class VendaService {

    @Autowired
    private VendaRepository vendaRepository;

    public List<Venda> findAll() {
        return vendaRepository.findAll();
    }

    public Optional<Venda> findById(Long id) {
        return vendaRepository.findById(id);
    }

    public Venda save(Venda venda) {
        return vendaRepository.save(venda);
    }

    public Venda update(Venda venda) {
        return vendaRepository.save(venda);
    }

    public void deleteById(Long id) {
        vendaRepository.deleteById(id);
    }
}
