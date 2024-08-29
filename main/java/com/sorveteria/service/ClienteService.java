@Service
public class ClienteService {
    @Autowired
    private ClienteRepository clienteRepository;

    public Cliente adicionarCliente(Cliente cliente) {
        return clienteRepository.save(cliente);
    }

    public Cliente editarCliente(Long id, Cliente clienteAtualizado) {
        Cliente cliente = clienteRepository.findById(id).orElseThrow();
        cliente.setNome(clienteAtualizado.getNome());
        cliente.setTelefone(clienteAtualizado.getTelefone());
        cliente.setEmail(clienteAtualizado.getEmail());
        cliente.setPreferencias(clienteAtualizado.getPreferencias());
        return clienteRepository.save(cliente);
    }

    public void removerCliente(Long id) {
        clienteRepository.deleteById(id);
    }

    public List<Cliente> listarClientes() {
        return clienteRepository.findAll();
    }

    public Cliente buscarClientePorId(Long id) {
        return clienteRepository.findById(id).orElseThrow();
    }
}
