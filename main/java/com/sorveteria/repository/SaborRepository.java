package com.sorveteria.repository;

import com.sorveteria.entity.Sabor;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface SaborRepository extends JpaRepository<Sabor, Long> {
    // Métodos personalizados podem ser adicionados aqui, se necessário
}
