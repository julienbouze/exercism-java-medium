import java.util.Map;
import java.util.HashMap;

class WordCount {
    public Map<String, Integer> phrase(String input) {
        Map<String, Integer> wordCountMap = new HashMap<>();
        String[] words = input.toLowerCase().
        replaceAll("[^\\w']+|'\\B|\\B'"," ").trim().split("\\s+");
        for (String word : words){
            wordCountMap.put(word, wordCountMap.getOrDefault(word, 0) + 1);
        }
        return wordCountMap;
    }
}
