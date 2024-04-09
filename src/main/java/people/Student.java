package people;
public class Student extends Customer{
    public long studentID;

    public static long uniqueID = 10000L;
    private final double DISCOUNT = 0.05;

    public long getStudentID() {
        return studentID;
    }

    public double getDISCOUNT() {
        return DISCOUNT;
    }

    public Student(String name, Size size) {
        super(name, size);
        uniqueID++;
        studentID = uniqueID;
    }

    @Override
    public void printPriceAfterDiscount(Cloth cloth) {
        System.out.println(cloth.getPrice() - (cloth.getPrice() * this.getDISCOUNT()));

    }


    public void printUniqueStudentID(){
        System.out.println(this.studentID);
    }

    @Override
    public void printInfo() {
        System.out.println("Student{Name: " + this.getName() +
                ", Size: " + this.getSize() +
                ", StudentID: " + this.studentID +
                "}");
    }

}
