package com.sorveteria.entity;

import jakarta.persistence.*;
import lombok.Data;

@Data
@Entity
public class Sabor {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String nome;

    private String categoria; // Ex: Frutas, Chocolate, Especial

    private String descricao;

    private boolean emEstoque;

    private double preco;

    private boolean sazonal; // Indica se o sabor é sazonal

    private String informacoesAdicionais; // Informações sobre alergênicos ou restrições dietéticas
}
