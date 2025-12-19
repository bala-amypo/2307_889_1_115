public interface ShipmentRecordRepository extends JpaRepository<ShipmentRecord, Long> {
    Optional<ShipmentRecord> findByShipmentCode(String code);
}
