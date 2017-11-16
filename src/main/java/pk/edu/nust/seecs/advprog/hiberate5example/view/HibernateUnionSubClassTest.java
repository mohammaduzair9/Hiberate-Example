package pk.edu.nust.seecs.advprog.hiberate5example.view;

import pk.edu.nust.seecs.advprog.hiberate5example.bo.EmployeeBo;
import pk.edu.nust.seecs.advprog.hiberate5example.bo.impl.EmployeeBoImpl;

public class HibernateUnionSubClassTest {
    private EmployeeBo employeeHandler = new EmployeeBoImpl();
    
    public static void main(String[] args) {
        HibernateUnionSubClassTest hbt = new HibernateUnionSubClassTest();
        hbt.doAll();
    }
    
    public void doAll(){
        int emp1Id = employeeHandler.addEmployee("fahad");
        int emp2Id = employeeHandler.addEmployee("Obaid");
        int emp3Id = employeeHandler.addEmployee("Zohaib");
        int emp4Id = employeeHandler.addEmployee("Sadaf");
        
        employeeHandler.addRegularEmployee(emp1Id, 1.0f , 0);
        employeeHandler.addContractEmployee(emp2Id, 0.3f , "1 year");
        employeeHandler.addContractEmployee(emp3Id, 0.2f , "1 year");
        employeeHandler.addContractEmployee(emp4Id, 0.6f , "2 years");
        
        employeeHandler.saveEmployees();
    }
}
