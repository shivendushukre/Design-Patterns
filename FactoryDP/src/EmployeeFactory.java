public class EmployeeFactory {

    //get the employee

    public static Employee getEmployee(String empType) {
        if (empType.trim().equalsIgnoreCase("Developer")) {
            return new Developer();
        }
        else  if (empType.trim().equalsIgnoreCase("Manager")){
            return new Manager();
        }
        else {
            return null;
        }
    }
}
