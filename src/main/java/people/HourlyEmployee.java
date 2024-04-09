package people;

public class HourlyEmployee extends Employee{
    private float hoursWorked;
    private double hourlyWage;

    public HourlyEmployee(String name, Size size, float hoursWorked, double hourlyWage) {
        super(name, size);
        this.hoursWorked = hoursWorked;
        this.hourlyWage = hourlyWage;
    }


    public float getHoursWorked() {
        return hoursWorked;
    }

    public void setHoursWorked(float hoursWorked) {
        if (hoursWorked >= 0) {
            this.hoursWorked = hoursWorked;
        }

    }

    public double getHourlyWage() {
        return hourlyWage;
    }

    public void setHourlyWage(double hourlyWage) {
        if (hourlyWage >= 0) {
            this.hourlyWage = hourlyWage;
        }

    }

    @Override
    public void printInfo() {
        System.out.println("HourlyEmployee{Name: " + this.getName() +
                ", Size: " + this.getSize() +
                ", HoursWorked: " + hoursWorked +
                ", HourlyWage: " + hourlyWage +
                "}");
    }

    @Override
    public double calculatePay() {
        return this.hourlyWage * this.hoursWorked;
    }

    @Override
    public void printPriceAfterDiscount(Cloth cloth) {
        System.out.println(cloth.getPrice() - (cloth.getPrice() * this.getDISCOUNT()));

    }
}
