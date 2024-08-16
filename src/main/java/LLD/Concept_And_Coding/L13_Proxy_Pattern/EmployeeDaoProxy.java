package LLD.Concept_And_Coding.L13_Proxy_Pattern;

/**
 * Project: DSAlgo
 * Package: LLD.Concept_And_Coding.L13_Proxy_Pattern
 * <p>
 * User: piyushbajaj
 * Date: 07/04/23
 * Time: 11:55 pm
 */
public class EmployeeDaoProxy implements EmployeeDao {
    EmployeeDao employeeDaoObj;

    EmployeeDaoProxy() {
        employeeDaoObj = new EmployeeDaoImpl();
    }

    @Override
    public void create(String client, EmployeeDo obj) throws Exception {
        if (client.equalsIgnoreCase("ADMIN")) {
            employeeDaoObj.create(client, obj);
            return;
        }

        throw new Exception("Access Denied");
    }

    @Override
    public void delete(String client, int employeeId) throws Exception {
        if (client.equalsIgnoreCase("ADMIN")) {
            employeeDaoObj.delete(client, employeeId);
            return;
        }

        throw new Exception("Access Denied");
    }

    @Override
    public EmployeeDo get(String client, int employeeId) throws Exception {
        if (client.equalsIgnoreCase("ADMIN") || client.equalsIgnoreCase("USER")) {
            return employeeDaoObj.get(client, employeeId);
        }

        throw new Exception("Access Denied");
    }
}
