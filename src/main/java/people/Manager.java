package people;

public class Manager extends Employee{
    private final double EXTRA_DISCOUNT = 0.05;
    private double salary;

    public Manager(String name, Size size, double salary) {
        super(name, size);
        this.salary = salary;
    }

    public double getEXTRA_DISCOUNT() {
        return EXTRA_DISCOUNT;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        if (salary > 0) {
            this.salary = salary;
        }

    }

    @Override
    public void printInfo() {
        System.out.println("Manager{Name: " + this.getName() +
                ", Size: " + this.getSize() +
                ", Salary: " + salary +
                "}");
    }

    @Override
    public double calculatePay() {
        return this.salary;
    }

    @Override
    public void printPriceAfterDiscount(Cloth cloth) {
        double totalDiscount = this.getEXTRA_DISCOUNT() + this.getDISCOUNT();
        System.out.println(cloth.getPrice() - (cloth.getPrice() * totalDiscount));

    }
}
