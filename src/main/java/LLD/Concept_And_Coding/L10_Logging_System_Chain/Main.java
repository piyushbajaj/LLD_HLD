package LLD.Concept_And_Coding.L10_Logging_System_Chain;

/**
 * Project: DSAlgo
 * Package: LLD.Concept_And_Coding.L10_Logging_System
 * <p>
 * User: piyushbajaj
 * Date: 07/04/23
 * Time: 8:59 pm
 */
public class Main {
    public static void main(String[] args) {
        S1_LogProcessor logProcessor =
            new S2_InfoLogProcessor(new S2_DebugLogProcessor(new S2_ErrorLogProcessor(null)));

        logProcessor.log(S1_LogProcessor.ERROR, "Exception happens");
        logProcessor.log(S1_LogProcessor.DEBUG, "Need to debug this");
        logProcessor.log(S1_LogProcessor.INFO, "Just for info");
    }
}
