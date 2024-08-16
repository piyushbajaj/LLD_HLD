package LLD.Concept_And_Coding.L10_Logging_System_Chain;

/**
 * Project: DSAlgo
 * Package: LLD.Concept_And_Coding.L10_Logging_System
 * <p>
 * User: piyushbajaj
 * Date: 07/04/23
 * Time: 9:00 pm
 */
public class S2_DebugLogProcessor extends S1_LogProcessor {
    S2_DebugLogProcessor(S1_LogProcessor logProcessor) {
        super(logProcessor);
    }

    /**
     * @param logLevel
     * @param message
     */
    public void log(int logLevel, String message) {
        if (logLevel == DEBUG) {
            System.out.println("DEBUG: " + message);
        } else {
            super.log(logLevel, message);
        }
    }
}
