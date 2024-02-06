import java.util.ArrayList;
import java.util.List;

class PrimeFactorsCalculator {

    List<Long> calculatePrimeFactorsOf(long number) {
        List<Long> factors = new ArrayList<>();

        for (long divisor = 2; divisor <= number; divisor++) {
            while (number % divisor == 0) {
                factors.add(divisor);
                number /= divisor;
            }
        }

        return factors;
    }
}
