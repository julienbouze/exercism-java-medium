class LargestSeriesProductCalculator {

    private String inputNumber;
    LargestSeriesProductCalculator(String inputNumber) {
        for (int i = 0; i<inputNumber.length();++i){
            if(!Character.isDigit(inputNumber.charAt(i))){
                throw new IllegalArgumentException("String to search may only contain digits.");
            }
            this.inputNumber = inputNumber;
        }
    }

    long calculateLargestProductForSeriesLength(int numberOfDigits) {
        if (numberOfDigits <= 0) {
            throw new IllegalArgumentException ("Series length must be non-negative.");
        }
        if (numberOfDigits > inputNumber.length()){
            throw new IllegalArgumentException("Series length must be less than or equal to the length of the string to search.")
        }
        long largestProduct = 0;
        for (int i=0; i<inputNumber.length()-numberOfDigits;++numberOfDigits){
            String sub = inputNumber.substring(i, i+numberOfDigits);
        }
    }
}
