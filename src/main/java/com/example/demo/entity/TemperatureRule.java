@Entity
public class TemperatureRule {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String productType;
    private Double minTemp;
    private Double maxTemp;
    private Boolean active;
    private LocalDate effectiveFrom;
    private LocalDate effectiveTo;
}
