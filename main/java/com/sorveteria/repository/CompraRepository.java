public interface CompraRepository extends JpaRepository<Compra, Long> {
    List<Compra> findByFornecedorId(Long fornecedorId);
}
