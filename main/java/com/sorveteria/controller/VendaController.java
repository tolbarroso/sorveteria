@RestController
@RequestMapping("/vendas")
public class VendaController {
    @Autowired
    private VendaService vendaService;

    @PostMapping
    public Venda registrarVenda(@RequestBody Venda venda) {
        return vendaService.registrarVenda(venda);
    }

    @GetMapping
    public List<Venda> listarVendas() {
        return vendaService.listarVendas();
    }

    @GetMapping("/{id}")
    public Venda buscarVendaPorId(@PathVariable Long id) {
        return vendaService.buscarVendaPorId(id);
    }
}
