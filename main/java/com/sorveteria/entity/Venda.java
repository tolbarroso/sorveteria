package com.sorveteria.entity;

import jakarta.persistence.*;
import lombok.Data;
import java.util.Date;
import java.util.List;

@Data
@Entity
public class Venda {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @ManyToOne
    private Cliente cliente;

    @ManyToMany
    private List<Sabor> sabores;

    private String tamanho; // Pequeno, Médio, Grande

    private int quantidade;

    private double total;

    private String metodoPagamento;

    private Date dataVenda;
}
