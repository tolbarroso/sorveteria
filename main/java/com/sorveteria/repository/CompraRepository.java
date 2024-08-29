package com.sorveteria.repository;

import com.sorveteria.entity.Compra;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CompraRepository extends JpaRepository<Compra, Long> {
    // Métodos personalizados podem ser adicionados aqui, se necessário
}
