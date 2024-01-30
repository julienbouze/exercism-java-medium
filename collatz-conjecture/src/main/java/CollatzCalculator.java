class CollatzCalculator {

    int computeStepCount(int start) {
        if (start > 0){
            int number = 0;
            while (start !=1){
                number += 1;
                if (start % 2 == 0){
                    start = start / 2;
                }
                else {
                    start = 3 * start + 1;
                }
            }
            return number;
        }
        else {
            throw new IllegalArgumentException("Only positive integers are allowed");
        }
    }
}
