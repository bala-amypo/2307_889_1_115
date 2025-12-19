Bpublic interface TemperatureRuleRepository extends JpaRepository<TemperatureRule, Long> {
    @Query("SELECT r FROM TemperatureRule r WHERE r.productType=:productType AND :date BETWEEN r.effectiveFrom AND r.effectiveTo")
    Optional<TemperatureRule> findApplicableRule(String productType, LocalDate date);
}
