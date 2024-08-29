package com.sorveteria.repository;

import com.sorveteria.entity.Fornecedor;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface FornecedorRepository extends JpaRepository<Fornecedor, Long> {
    // Métodos personalizados podem ser adicionados aqui, se necessário
}
