@Service
public class CompraService {
    @Autowired
    private CompraRepository compraRepository;

    public Compra registrarCompra(Compra compra) {
        return compraRepository.save(compra);
    }

    public List<Compra> listarCompras() {
        return compraRepository.findAll();
    }

    public Compra buscarCompraPorId(Long id) {
        return compraRepository.findById(id).orElseThrow();
    }
}
