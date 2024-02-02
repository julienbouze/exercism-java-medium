import java.util.ArrayList;
import java.util.List;

class Sieve {
    int maxPrime;
    Sieve(int maxPrime) {
        this.maxPrime = maxPrime;
    }

    List<Integer> getPrimes() {
        List<Integer> primes = new ArrayList<>();
        boolean[] isComposite = new boolean[maxPrime + 1];

        for (int i = 2; i <= Math.sqrt(maxPrime); ++i) {
            if (!isComposite[i]) {
                primes.add(i);
                for (int j = i * i; j <= maxPrime; j += i) {
                    isComposite[j] = true;
                }
            }
        }

        for (int i = (int) Math.sqrt(maxPrime) + 1; i <= maxPrime; ++i) {
            if (!isComposite[i]) {
                primes.add(i);
            }
        }

        return primes;
    }
}
