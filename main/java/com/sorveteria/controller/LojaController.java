@RestController
@RequestMapping("/lojas")
public class LojaController {
    @Autowired
    private LojaService lojaService;

    @PostMapping
    public Loja adicionarLoja(@RequestBody Loja loja) {
        return lojaService.adicionarLoja(loja);
    }

    @PutMapping("/{id}")
    public Loja editarLoja(@PathVariable Long id, @RequestBody Loja loja) {
        return lojaService.editarLoja(id, loja);
    }

    @DeleteMapping("/{id}")
    public void removerLoja(@PathVariable Long id) {
        lojaService.removerLoja(id);
    }

    @GetMapping
    public List<Loja> listarLojas() {
        return lojaService.listarLojas();
    }

    @GetMapping("/{id}")
    public Loja buscarLojaPorId(@PathVariable Long id) {
        return lojaService.buscarLojaPorId(id);
    }
}
