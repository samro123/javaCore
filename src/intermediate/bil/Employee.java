package intermediate.bil;

public class Employee extends HumanResource {
    @Override
    public double salary(int l) {
        return l * 40.0;
    }
}
