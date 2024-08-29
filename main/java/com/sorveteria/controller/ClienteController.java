@RestController
@RequestMapping("/clientes")
public class ClienteController {
    @Autowired
    private ClienteService clienteService;

    @PostMapping
    public Cliente adicionarCliente(@RequestBody Cliente cliente) {
        return clienteService.adicionarCliente(cliente);
    }

    @PutMapping("/{id}")
    public Cliente editarCliente(@PathVariable Long id, @RequestBody Cliente cliente) {
        return clienteService.editarCliente(id, cliente);
    }

    @DeleteMapping("/{id}")
    public void removerCliente(@PathVariable Long id) {
        clienteService.removerCliente(id);
    }

    @GetMapping
    public List<Cliente> listarClientes() {
        return clienteService.listarClientes();
    }

    @GetMapping("/{id}")
    public Cliente buscarClientePorId(@PathVariable Long id) {
        return clienteService.buscarClientePorId(id);
    }
}
