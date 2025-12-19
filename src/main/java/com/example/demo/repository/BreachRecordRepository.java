public interface BreachRecordRepository extends JpaRepository<BreachRecord, Long> {
    List<BreachRecord> findByShipmentId(Long shipmentId);
}
