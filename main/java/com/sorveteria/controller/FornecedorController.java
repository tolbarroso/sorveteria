@RestController
@RequestMapping("/fornecedores")
public class FornecedorController {
    @Autowired
    private FornecedorService fornecedorService;

    @PostMapping
    public Fornecedor adicionarFornecedor(@RequestBody Fornecedor fornecedor) {
        return fornecedorService.adicionarFornecedor(fornecedor);
    }

    @PutMapping("/{id}")
    public Fornecedor editarFornecedor(@PathVariable Long id, @RequestBody Fornecedor fornecedor) {
        return fornecedorService.editarFornecedor(id, fornecedor);
    }

    @DeleteMapping("/{id}")
    public void removerFornecedor(@PathVariable Long id) {
        fornecedorService.removerFornecedor(id);
    }

    @GetMapping
    public List<Fornecedor> listarFornecedores() {
        return fornecedorService.listarFornecedores();
    }

    @GetMapping("/{id}")
    public Fornecedor buscarFornecedorPorId(@PathVariable Long id) {
        return fornecedorService.buscarFornecedorPorId(id);
    }
}
