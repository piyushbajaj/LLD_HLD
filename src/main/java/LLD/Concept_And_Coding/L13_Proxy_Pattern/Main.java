package LLD.Concept_And_Coding.L13_Proxy_Pattern;

/**
 * Project: DSAlgo
 * Package: LLD.Concept_And_Coding.L13_Proxy_Pattern
 * <p>
 * User: piyushbajaj
 * Date: 08/04/23
 * Time: 12:01 am
 */
public class Main {
    public static void main(String[] args) {
        try {
            EmployeeDao employeeDao = new EmployeeDaoProxy();
//            employeeDao.create("USER", new EmployeeDo());
            employeeDao.create("ADMIN", new EmployeeDo());
            System.out.println("Operation successful");
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
}
