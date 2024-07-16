import java.util.Map;

public class ExchangeRates {
  private String base_code;
  private Map<String, Double> conversion_rates;

  public String getBaseCode() {
    return base_code;
  }

  public void setBaseCode(String baseCode) {
    this.base_code = baseCode;
  }

  public Map<String, Double> getConversionRates() {
    return conversion_rates;
  }

  public void setConversionRates(Map<String, Double> conversionRates) {
    this.conversion_rates = conversionRates;
  }
}
