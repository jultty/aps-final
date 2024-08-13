package ifsp.ads.aps.metrifier;

import java.time.LocalDateTime;

public class Metric {
  private String id;
  private Double value;
  private LocalDateTime date;

  public void setValue(Double value) {
    this.value = value;
  }

  public Double getValue() {
    return value;
  }
}
