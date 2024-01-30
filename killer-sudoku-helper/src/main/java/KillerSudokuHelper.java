import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class KillerSudokuHelper {

    public List<List<Integer>> combinationsInCage(Integer cageSum, Integer cageSize, List<Integer> exclude) {
        List<List<Integer>> combinations = combinationsInCage(cageSum, cageSize);
        List<List<Integer>> result = new ArrayList<>();

        for (Iterator<List<Integer>> iterator = combinations.iterator(); iterator.hasNext();) {
            List<Integer> combination = iterator.next();
            boolean containsExcluded = combination.stream().anyMatch(exclude::contains);
            if (!containsExcluded && sum(combination) == cageSum) {
                result.add(combination);
            }
        }

        return result;
    }

    List<List<Integer>> combinationsInCage(Integer cageSum, Integer cageSize) {
        List<List<Integer>> combinations = generateCombination(cageSize);
        List<List<Integer>> result = new ArrayList<>();
        for (int i = 0; i<combinations.size();++i){
            if (sum(combinations.get(i)) == cageSum){
                result.add(combinations.get(i));
            }
        }
        return result;
    }

    List<List<Integer>> generateCombination(int cageSize) {
        List<List<Integer>> result = new ArrayList<>();
        generateCombinaisonHelper(cageSize, 1, 9, new ArrayList<>(), result);
        return result;
    }

    void generateCombinaisonHelper(int cageSize, int start, int end, List<Integer> currentCombination, List<List<Integer>> result) {
        if (cageSize == 0) {
            result.add(new ArrayList<>(currentCombination));
            return;
        }

        for (int i = start; i <= end; i++) {
            currentCombination.add(i);
            generateCombinaisonHelper(cageSize - 1, i + 1, end, currentCombination, result);
            currentCombination.remove(currentCombination.size() - 1);
        }
    }
    Integer sum(List<Integer> list){
        Integer sum = 0;
        for (int i = 0; i<list.size();++i){
            sum += list.get(i);
        }
        return sum;

    }
}
