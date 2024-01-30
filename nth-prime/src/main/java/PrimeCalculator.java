import java.util.ArrayList;
import java.util.List;

class PrimeCalculator {

    int nth(int nth) {
        if (nth == 0){
            throw new IllegalArgumentException();
        }
        else {
            List<Integer> primeNumbers = new ArrayList<>();
            int nb = 2;
            while (primeNumbers.size() < nth) {
                if (isPrime(nb)) {
                    primeNumbers.add(nb);
                }
                nb++;
            }
            return primeNumbers.get(nth-1);
        }
    }

    boolean isPrime(int nb) {
        if (nb < 2) {
            return false;
        }
        for (int i = 2; i <= Math.sqrt(nb); i++) {
            if (nb % i == 0) {
                return false;
            }
        }
        return true;
    }
}
