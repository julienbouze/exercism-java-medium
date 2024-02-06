import java.util.List;
import java.util.Map;
import java.util.TreeMap;
import java.util.stream.Collectors;

class School {
    Map<String,Integer> roster = new TreeMap<>();

    boolean add(String student, int grade) {
        int rosterSize = roster.size();
        roster.putIfAbsent(student, grade);
        return roster.size() > rosterSize;
        
    }

    List<String> roster() {
        return roster.entrySet()
            .stream()
            .sorted(Map.Entry.comparingByValue())
            .map(Map.Entry::getKey)
            .collect(Collectors.toList());
    }

    List<String> grade(int grade) {
        return roster.entrySet()
            .stream()
            .filter(entry -> entry.getValue() == grade)
            .map(Map.Entry::getKey)
            .collect(Collectors.toList());
    }

}
