package chapter_08;

import java.util.*;

/**
 * Как я понимаю это задача на покрытие (плохо решаемая задача
 * Примерное условие (привязка к тексту книги):
 * Вы открываете собственную авторскую программу на радио и хотите, чтобы
 * вас слушали во всех 50 штатах...
 */
public class SetCovering {
    public static void main(String... args) {
        var statesNeeded = new HashSet<>(Arrays.asList("mt", "wa", "or", "id", "nv", "ut", "ca", "az"));
        var stations = new LinkedHashMap<String, Set<String>>();

        stations.put("kone", new HashSet<>(Arrays.asList("id", "nv", "ut")));
        stations.put("ktwo", new HashSet<>(Arrays.asList("wa", "id", "mt")));
        stations.put("kthree", new HashSet<>(Arrays.asList("or", "nv", "ca")));
        stations.put("kfour", new HashSet<>(Arrays.asList("nv", "ut")));
        stations.put("kfive", new HashSet<>(Arrays.asList("ca", "az")));

        var finalStations = new HashSet<String>();
        while (!statesNeeded.isEmpty()) {
            String bestStation = null;
            var statesCovered = new HashSet<String>();

            for (var station : stations.entrySet()) {
                var covered = new HashSet<>(statesNeeded);
                covered.retainAll(station.getValue());

                if (covered.size() > statesCovered.size()) {
                    bestStation = station.getKey();
                    statesCovered = covered;
                }
            }
            statesNeeded.removeIf(statesCovered::contains);

            if (bestStation != null) {
                finalStations.add(bestStation);
            }
        }
        System.out.println(finalStations); // [ktwo, kone, kthree, kfive]
    }
}
