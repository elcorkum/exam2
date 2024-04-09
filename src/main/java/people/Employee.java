package people;

public abstract class Employee extends Customer implements Payable{

    protected final double DISCOUNT = 0.1;

    public double getDISCOUNT() {
        return DISCOUNT;
    }

    public Employee(String name, Size size) {
        super(name, size);
    }
}
