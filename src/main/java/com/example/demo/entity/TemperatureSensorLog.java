@Entity
public class TemperatureSensorLog {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private Long shipmentId;
    private String sensorId;
    private LocalDateTime recordedAt;
    private Double temperatureValue;
    private String location;

    @PrePersist
    void onCreate() {
        recordedAt = LocalDateTime.now();
    }
}
