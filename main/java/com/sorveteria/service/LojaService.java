package com.sorveteria.service;

import com.sorveteria.entity.Loja;
import com.sorveteria.repository.LojaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class LojaService {

    @Autowired
    private LojaRepository lojaRepository;

    public List<Loja> findAll() {
        return lojaRepository.findAll();
    }

    public Optional<Loja> findById(Long id) {
        return lojaRepository.findById(id);
    }

    public Loja save(Loja loja) {
        return lojaRepository.save(loja);
    }

    public Loja update(Loja loja) {
        return lojaRepository.save(loja);
    }

    public void deleteById(Long id) {
        lojaRepository.deleteById(id);
    }
}
