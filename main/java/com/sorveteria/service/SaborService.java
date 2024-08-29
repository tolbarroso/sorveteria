@Service
public class SaborService {
    @Autowired
    private SaborRepository saborRepository;

    public Sabor adicionarSabor(Sabor sabor) {
        return saborRepository.save(sabor);
    }

    public Sabor editarSabor(Long id, Sabor saborAtualizado) {
        Sabor sabor = saborRepository.findById(id).orElseThrow();
        sabor.setNome(saborAtualizado.getNome());
        sabor.setCategoria(saborAtualizado.getCategoria());
        sabor.setDescricao(saborAtualizado.getDescricao());
        sabor.setEmEstoque(saborAtualizado.isEmEstoque());
        return saborRepository.save(sabor);
    }

    public void removerSabor(Long id) {
        saborRepository.deleteById(id);
    }

    public List<Sabor> listarSabores() {
        return saborRepository.findAll();
    }

    public Sabor buscarSaborPorId(Long id) {
        return saborRepository.findById(id).orElseThrow();
    }
}
