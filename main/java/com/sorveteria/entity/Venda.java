@Entity
public class Venda {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @ManyToOne
    private Cliente cliente;

    @ManyToOne
    private Sabor sabor;

    private String tamanho;
    private int quantidade;
    private double precoTotal;

    private String metodoPagamento;

    // Getters e Setters
}
