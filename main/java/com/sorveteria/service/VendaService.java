@Service
public class VendaService {
    @Autowired
    private VendaRepository vendaRepository;

    @Autowired
    private SaborRepository saborRepository;

    public Venda registrarVenda(Venda venda) {
        Sabor sabor = saborRepository.findById(venda.getSabor().getId()).orElseThrow();
        
        if (sabor.isEmEstoque()) {
            sabor.setEmEstoque(false); // Assumindo que uma venda consome todo o estoque, ajustar conforme necessário
            saborRepository.save(sabor);
            return vendaRepository.save(venda);
        } else {
            throw new IllegalStateException("Sabor fora de estoque");
        }
    }

    public List<Venda> listarVendas() {
        return vendaRepository.findAll();
    }

    public Venda buscarVendaPorId(Long id) {
        return vendaRepository.findById(id).orElseThrow();
    }
}
