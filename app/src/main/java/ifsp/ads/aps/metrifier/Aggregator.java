package ifsp.ads.aps.metrifier;

import java.time.LocalDateTime;
import java.util.List;

public interface Aggregator {
  public RawData aggregateRaw(List<LocalDateTime> dates, List<Double> values);
  public Metric aggregateMetric(List<LocalDateTime> dates, List<Double> values);
}
