package pk.edu.nust.seecs.advprog.hiberate5example.bo;

public interface EmployeeBo {

    int addContractEmployee(int empIndex, float pay_per_hour, String contract_period);

    int addEmployee(String name);

    int addRegularEmployee(int empIndex, float salary, int bonus);

    void saveEmployees();
    
}
