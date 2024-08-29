public interface SaborRepository extends JpaRepository<Sabor, Long> {
    List<Sabor> findByNomeContaining(String nome);
}
