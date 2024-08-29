@Service
public class FornecedorService {
    @Autowired
    private FornecedorRepository fornecedorRepository;

    public Fornecedor adicionarFornecedor(Fornecedor fornecedor) {
        return fornecedorRepository.save(fornecedor);
    }

    public Fornecedor editarFornecedor(Long id, Fornecedor fornecedorAtualizado) {
        Fornecedor fornecedor = fornecedorRepository.findById(id).orElseThrow();
        fornecedor.setNome(fornecedorAtualizado.getNome());
        fornecedor.setCnpj(fornecedorAtualizado.getCnpj());
        fornecedor.setTelefone(fornecedorAtualizado.getTelefone());
        fornecedor.setEmail(fornecedorAtualizado.getEmail());
        fornecedor.setEndereco(fornecedorAtualizado.getEndereco());
        return fornecedorRepository.save(fornecedor);
    }

    public void removerFornecedor(Long id) {
        fornecedorRepository.deleteById(id);
    }

    public List<Fornecedor> listarFornecedores() {
        return fornecedorRepository.findAll();
    }

    public Fornecedor buscarFornecedorPorId(Long id) {
        return fornecedorRepository.findById(id).orElseThrow();
    }
}
