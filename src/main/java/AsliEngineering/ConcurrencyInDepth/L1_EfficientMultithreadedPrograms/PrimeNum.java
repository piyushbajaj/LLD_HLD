package AsliEngineering.ConcurrencyInDepth.L1_EfficientMultithreadedPrograms;

import java.time.Duration;
import java.time.Instant;

/**
 * Project: DSAlgo
 * Package: AsliEngineering.ConcurrencyInDepth
 * <p>
 * User: piyushbajaj
 * Date: 09/08/23
 * Time: 5:11 pm
 */
public class PrimeNum {

    static int max = 100000000;
    static int totalPrimeNumbers = 0;

    public static void checkPrime(int x) {
        if ((x & 1) == 0) {
            return;
        }

        for (int i = 3; i <= Math.sqrt(x); i++) {
            if (x % i == 0) {
                return;
            }
        }
        totalPrimeNumbers++;
    }

    public static void main(String[] args) {
        Instant startTime = Instant.now();

        for (int i = 3; i < max; i++) {
            checkPrime(i);
        }

        Instant endTime = Instant.now();

        Duration timeElapsed = Duration.between(startTime, endTime);

        System.out.println(
            "Checking till " + max + ", found " + totalPrimeNumbers + 1 + ", Prime Numbers took " +
                (timeElapsed.toSeconds()));
    }
}
