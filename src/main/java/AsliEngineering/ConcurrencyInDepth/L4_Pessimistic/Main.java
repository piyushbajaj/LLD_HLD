package AsliEngineering.ConcurrencyInDepth.L4_Pessimistic;

/**
 * Project: DSAlgo
 * Package: AsliEngineering.ConcurrencyInDepth.L4_Pessimistic
 * <p>
 * User: piyushbajaj
 * Date: 19/08/23
 * Time: 12:29 am
 */
public class Main {
    static int count = 0;

    static void incrementCount() {
        count++;
    }

    static void doCount() {
        for (int i = 0; i < 1000000; i++) {
            incrementCount();
        }
    }

    public static void main(String[] args) {
        count = 0;
        doCount();
    }
}
