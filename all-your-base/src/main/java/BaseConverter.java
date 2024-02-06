import java.util.ArrayList;

class BaseConverter {
    int originalBase;
    int[] originalDigits;

    BaseConverter(int originalBase, int[] originalDigits) {
        if (originalBase < 2){
            throw new IllegalArgumentException("Bases must be at least 2.");
        }
        for (int i=0; i < originalDigits.length;++i){
            if (originalDigits[i] >= originalBase){
                throw new IllegalArgumentException("All digits must be strictly less than the base.");
            }
            if (originalDigits[i] < 0){
                throw new IllegalArgumentException("Digits may not be negative.");
            }
        }
        this.originalBase = originalBase;
        this.originalDigits = originalDigits;
    }

    int[] convertToBase(int newBase) {
        if(newBase < 2){
            throw new IllegalArgumentException("Bases must be at least 2.");
        }
        int decimalValue = 0;
        for (int i = 0; i < originalDigits.length; ++i) {
            decimalValue += originalDigits[i] * Math.pow(originalBase, originalDigits.length - i - 1);
        }

        ArrayList<Integer> resultDigitsList = new ArrayList<>();
        while (decimalValue > 0) {
            int remainder = decimalValue % newBase;
            resultDigitsList.add(0, remainder); 
            decimalValue /= newBase;
        }

        int[] resultDigits = new int[resultDigitsList.size()];
        for (int i = 0; i < resultDigitsList.size(); i++) {
            resultDigits[i] = resultDigitsList.get(i);
        }
        if (originalDigits.length == 0 || resultDigits.length == 0){
            return new int[1];
        }
        return resultDigits;
    }


}
