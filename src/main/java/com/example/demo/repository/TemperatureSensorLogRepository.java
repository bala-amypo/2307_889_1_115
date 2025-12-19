public interface TemperatureSensorLogRepository extends JpaRepository<TemperatureSensorLog, Long> {
    List<TemperatureSensorLog> findByShipmentId(Long shipmentId);
}
