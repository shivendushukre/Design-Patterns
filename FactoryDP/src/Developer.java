public class Developer implements Employee{
    @Override
    public int getSalary() {
        System.out.println("Getting developer salary");
        return 5000;
    }
}
