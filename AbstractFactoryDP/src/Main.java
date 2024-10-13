public class Main {
    public static void main(String[] args) {

        Employee employee = EmployeeFactory.getEmployee(new DeveloperFactory());
        System.out.println(employee.name() + " " + employee.salary());

        Employee manager = EmployeeFactory.getEmployee(new ManagerFactory());
        System.out.println(manager.name() + " " + manager.salary());
    }
}