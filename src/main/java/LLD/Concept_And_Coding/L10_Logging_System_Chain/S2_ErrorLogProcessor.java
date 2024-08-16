package LLD.Concept_And_Coding.L10_Logging_System_Chain;

/**
 * Project: DSAlgo
 * Package: LLD.Concept_And_Coding.L10_Logging_System
 * <p>
 * User: piyushbajaj
 * Date: 07/04/23
 * Time: 9:00 pm
 */
public class S2_ErrorLogProcessor extends S1_LogProcessor {
    S2_ErrorLogProcessor(S1_LogProcessor nextLogProcessor) {
        super(nextLogProcessor);
    }

    /**
     * @param logLevel
     * @param message
     */
    public void log(int logLevel, String message) {
        if (logLevel == ERROR) {
            System.out.println("ERROR: " + message);
        } else {
            super.log(logLevel, message);
        }
    }
}
