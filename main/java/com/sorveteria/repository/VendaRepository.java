package com.sorveteria.repository;

import com.sorveteria.entity.Venda;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface VendaRepository extends JpaRepository<Venda, Long> {
    // Métodos personalizados podem ser adicionados aqui, se necessário
}
