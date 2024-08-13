package ifsp.ads.aps;

import ifsp.ads.aps.metrifier.AccuracyMetrifier;
import ifsp.ads.aps.metrifier.Metric;
import ifsp.ads.aps.metrifier.Metrifier;
import ifsp.ads.aps.metrifier.RawData;

import java.time.LocalDateTime;
import java.util.HashMap;
import java.util.Map;

public class App {
    public static void main(String[] args) {

        RawData rawData = new RawData();
        Metrifier metrifier = new AccuracyMetrifier();

        Map<LocalDateTime, Double> sampleData = new HashMap<>();

        LocalDateTime now = LocalDateTime.now();
        sampleData.put(now, 10.5);
        sampleData.put(now.plusHours(1), 15.2);
        sampleData.put(now.plusHours(2), 8.7);
        sampleData.put(now.plusHours(3), 12.3);
        sampleData.put(now.plusHours(4), 9.8);

        rawData.setData(sampleData);

        Metric accuracyMetric = metrifier.metrify(rawData);

        System.out.println(accuracyMetric.getValue());

    }
}
