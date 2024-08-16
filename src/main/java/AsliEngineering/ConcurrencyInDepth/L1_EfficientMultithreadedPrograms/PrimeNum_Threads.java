package AsliEngineering.ConcurrencyInDepth.L1_EfficientMultithreadedPrograms;

import java.time.Instant;
import java.util.concurrent.atomic.AtomicInteger;

/**
 * Project: DSAlgo
 * Package: AsliEngineering.ConcurrencyInDepth
 * <p>
 * User: piyushbajaj
 * Date: 09/08/23
 * Time: 7:03 pm
 */
public class PrimeNum_Threads {

    static int max = 100000000;
    static int concurrency = 10;
    private static final AtomicInteger totalPrimeNumbers = new AtomicInteger(0);

    public static void checkPrime(int x) {
        if ((x & 1) == 0) {
            return;
        }

        for (int i = 3; i <= Math.sqrt(x); i++) {
            if (x % i == 0) {
                return;
            }
        }

        totalPrimeNumbers.incrementAndGet();
    }

    private static void doBatch(String name, int nstart, int nend) {

    }


    public static void main(String[] args) {
        Instant startTime = Instant.now();
        int nstart = 3;
        int batchSize = max / concurrency;

        for (int i = 0; i < concurrency - 1; i++) {
//            doBatch();
            nstart += batchSize;
        }
    }
}
