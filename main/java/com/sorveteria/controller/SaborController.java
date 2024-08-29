@RestController
@RequestMapping("/sabores")
public class SaborController {
    @Autowired
    private SaborService saborService;

    @PostMapping
    public Sabor adicionarSabor(@RequestBody Sabor sabor) {
        return saborService.adicionarSabor(sabor);
    }

    @PutMapping("/{id}")
    public Sabor editarSabor(@PathVariable Long id, @RequestBody Sabor sabor) {
        return saborService.editarSabor(id, sabor);
    }

    @DeleteMapping("/{id}")
    public void removerSabor(@PathVariable Long id) {
        saborService.removerSabor(id);
    }

    @GetMapping
    public List<Sabor> listarSabores() {
        return saborService.listarSabores();
    }

    @GetMapping("/{id}")
    public Sabor buscarSaborPorId(@PathVariable Long id) {
        return saborService.buscarSaborPorId(id);
    }
}
