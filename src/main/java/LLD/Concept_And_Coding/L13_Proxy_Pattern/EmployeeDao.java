package LLD.Concept_And_Coding.L13_Proxy_Pattern;

/**
 * Project: DSAlgo
 * Package: LLD.Concept_And_Coding.L13_Proxy_Pattern
 * <p>
 * User: piyushbajaj
 * Date: 07/04/23
 * Time: 11:42 pm
 */
public interface EmployeeDao {
    void create(String client, EmployeeDo obj) throws Exception;

    void delete(String client, int employeeId) throws Exception;

    EmployeeDo get(String client, int employeeId) throws Exception;
}
