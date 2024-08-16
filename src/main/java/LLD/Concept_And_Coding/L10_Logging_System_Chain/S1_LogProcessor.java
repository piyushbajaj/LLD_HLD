package LLD.Concept_And_Coding.L10_Logging_System_Chain;

/**
 * Project: DSAlgo
 * Package: LLD.Concept_And_Coding.L10_Logging_System
 * <p>
 * User: piyushbajaj
 * Date: 07/04/23
 * Time: 8:59 pm
 */
public abstract class S1_LogProcessor {
    public static int INFO = 1;
    public static int DEBUG = 2;
    public static int ERROR = 3;

    S1_LogProcessor nextLoggerProcessor;

    S1_LogProcessor(S1_LogProcessor logProcessor) {
        this.nextLoggerProcessor = logProcessor;
    }

    public void log(int logLevel, String message) {
        if (nextLoggerProcessor != null) {
            nextLoggerProcessor.log(logLevel, message);
        }
    }
}
