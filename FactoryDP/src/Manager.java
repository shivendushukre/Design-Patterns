public class Manager implements Employee{
    @Override
    public int getSalary() {
        System.out.println("Getting manager salary");
        return 50000;
    }
}
