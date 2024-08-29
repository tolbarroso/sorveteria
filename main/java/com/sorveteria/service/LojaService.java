@Service
public class LojaService {
    @Autowired
    private LojaRepository lojaRepository;

    public Loja adicionarLoja(Loja loja) {
        return lojaRepository.save(loja);
    }

    public Loja editarLoja(Long id, Loja lojaAtualizada) {
        Loja loja = lojaRepository.findById(id).orElseThrow();
        loja.setNome(lojaAtualizada.getNome());
        loja.setEndereco(lojaAtualizada.getEndereco());
        loja.setTelefone(lojaAtualizada.getTelefone());
        return lojaRepository.save(loja);
    }

    public void removerLoja(Long id) {
        lojaRepository.deleteById(id);
    }

    public List<Loja> listarLojas() {
        return lojaRepository.findAll();
    }

    public Loja buscarLojaPorId(Long id) {
        return lojaRepository.findById(id).orElseThrow();
    }
}
