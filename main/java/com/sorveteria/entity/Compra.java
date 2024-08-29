@Entity
public class Compra {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @ManyToOne
    private Fornecedor fornecedor;

    private String item;
    private int quantidade;
    private double valorTotal;
    private LocalDate dataCompra;

    // Getters e Setters
}
