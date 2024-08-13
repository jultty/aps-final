package ifsp.ads.aps.metrifier;

import java.time.LocalDateTime;
import java.util.Map;

public class RawData {
  private Map<LocalDateTime, Double> data;

  public Map<LocalDateTime, Double> getData() {
    return data;
  }

  public void setData(Map<LocalDateTime, Double> data) {
    this.data = data;
  }
}
