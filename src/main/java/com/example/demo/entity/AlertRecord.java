@Entity
public class AlertRecord {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private Long shipmentId;
    private Long breachId;
    private String alertType;
    private String message;
    private LocalDateTime sentAt;
    private Boolean acknowledged;

    @PrePersist
    void onCreate() {
        sentAt = LocalDateTime.now();
        acknowledged = false;
    }
}
