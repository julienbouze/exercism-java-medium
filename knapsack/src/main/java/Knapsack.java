import java.util.List;

class Knapsack {

    int maximumValue(int maximumWeight, List<Item> items) {
        int size = items.size();

        if (size == 0 || maximumWeight == 0){
            return 0;
        }

        Item lastItem = items.get(size - 1);

        if (lastItem.weight > maximumWeight) {
            return maximumValue(maximumWeight, items.subList(0, size - 1));
        } else {
            int valueIncludingLast = lastItem.value + maximumValue(maximumWeight - lastItem.weight, items.subList(0, size - 1));
            int valueExcludingLast = maximumValue(maximumWeight, items.subList(0, size - 1));

            return Math.max(valueIncludingLast, valueExcludingLast);
        }
    }

}