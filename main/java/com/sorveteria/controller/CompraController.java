@RestController
@RequestMapping("/compras")
public class CompraController {
    @Autowired
    private CompraService compraService;

    @PostMapping
    public Compra registrarCompra(@RequestBody Compra compra) {
        return compraService.registrarCompra(compra);
    }

    @GetMapping
    public List<Compra> listarCompras() {
        return compraService.listarCompras();
    }

    @GetMapping("/{id}")
    public Compra buscarCompraPorId(@PathVariable Long id) {
        return compraService.buscarCompraPorId(id);
    }
}
