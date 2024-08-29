package com.sorveteria.entity;

import jakarta.persistence.*;
import lombok.Data;
import java.util.List;

@Data
@Entity
public class Fornecedor {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String nome;
    
    private String cnpj;

    private String telefone;

    private String email;

    private String endereco;

    @OneToMany(mappedBy = "fornecedor")
    private List<Loja> lojas;
}
