package ifsp.ads.aps.metrifier;

import java.time.LocalDateTime;
import java.util.Map;

public class AccuracyMetrifier implements Metrifier {

  @Override
  public Metric metrify(RawData data) {
    Metric metric = new Metric();

    Map<LocalDateTime, Double> rawData = data.getData();

    if (rawData.isEmpty()) {
      metric.setValue(0.0);
      return metric;
    }

    double sum = rawData.values().stream()
        .mapToDouble(Double::doubleValue)
        .sum();

    double average = sum / rawData.size();

    metric.setValue(average);

    return metric;
  }
}
