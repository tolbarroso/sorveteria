@Entity
public class Sabor {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String nome;
    private String categoria;
    private String descricao;
    private boolean emEstoque;

    // Getters e Setters
}
