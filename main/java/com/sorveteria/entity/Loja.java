package com.sorveteria.entity;

import jakarta.persistence.*;
import lombok.Data;

@Data
@Entity
public class Loja {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String nome;
    
    private String endereco;

    private String telefone;

    @ManyToOne
    private Fornecedor fornecedor;
}
