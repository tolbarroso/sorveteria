package com.sorveteria.service;

import com.sorveteria.entity.Sabor;
import com.sorveteria.repository.SaborRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class SaborService {

    @Autowired
    private SaborRepository saborRepository;

    public List<Sabor> findAll() {
        return saborRepository.findAll();
    }

    public Optional<Sabor> findById(Long id) {
        return saborRepository.findById(id);
    }

    public Sabor save(Sabor sabor) {
        return saborRepository.save(sabor);
    }

    public Sabor update(Sabor sabor) {
        return saborRepository.save(sabor);
    }

    public void deleteById(Long id) {
        saborRepository.deleteById(id);
    }
}
