package LLD.Concept_And_Coding.L13_Proxy_Pattern;

/**
 * Project: DSAlgo
 * Package: LLD.Concept_And_Coding.L13_Proxy_Pattern
 * <p>
 * User: piyushbajaj
 * Date: 07/04/23
 * Time: 11:45 pm
 * <p>
 * Concrete Class
 */
public class EmployeeDaoImpl implements EmployeeDao {
    @Override
    public void create(String client, EmployeeDo obj) throws Exception {
        System.out.println("Created new row in the employee table");
    }

    @Override
    public void delete(String client, int employeeId) throws Exception {
        System.out.println("Deleted row for the employeeId: " + employeeId);
    }

    @Override
    public EmployeeDo get(String client, int employeeId) throws Exception {
        System.out.println("Fetching data from the DB");
        return new EmployeeDo();
    }
}
