package com.sorveteria.entity;

import jakarta.persistence.*;
import lombok.Data;
import java.util.List;

@Data
@Entity
public class Cliente {
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    
    private String nome;
    
    private String telefone;
    
    private String email;
    
    @ElementCollection
    private List<String> preferencias; // Preferências de sabores ou produtos favoritos

    private int pontosFidelidade; // Acumulação de pontos para promoções e descontos
}
