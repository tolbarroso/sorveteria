public interface VendaRepository extends JpaRepository<Venda, Long> {
    List<Venda> findByClienteId(Long clienteId);
    List<Venda> findBySaborId(Long saborId);
}
