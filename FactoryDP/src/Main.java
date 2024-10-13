public class Main {
    public static void main(String[] args) {

        Employee employee = EmployeeFactory.getEmployee("Developer");
        assert employee != null;
        int salary = employee.getSalary();
        System.out.println(salary);

        Employee manager = EmployeeFactory.getEmployee("Manager");
        System.out.println(manager.getSalary());
    }
}