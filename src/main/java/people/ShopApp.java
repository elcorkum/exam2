package people;

public class ShopApp {
    public static boolean isAFit(Customer customer, Cloth cloth) {
        boolean fit = false;
        if (customer.getSize().equals(cloth.getSize())){
            fit = true;
        }
        return fit;
    }

    public static double calculateSubTotal(Cloth[] clothes){
        double subtotal = 0;
        for(Cloth cloth: clothes){
            subtotal += cloth.getPrice();
        }
        return subtotal;
    }

    public static void printClassNamesOfPayableEntities(Payable[] payables){
        for(Payable payable: payables) {
            System.out.println(payable.getClass().getSimpleName());
        }
    }


    public static void main(String[] args) {
        //Q1 answer
        Cloth top = new Cloth("Jacket", 50.79, Size.XL);
        Cloth bottoms = new Cloth("Cargos", 35.70, Size.M);
        Cloth layers = new Cloth("Tights", 15.60, Size.L);
        Cloth[] clothes = {top, bottoms, layers};

        //Q2 answer
        System.out.println(calculateSubTotal(clothes));
        System.out.println("============================");

        //Q3
        Student student1 = new Student("Mario", Size.XL);
        Student student2 = new Student("Luigi", Size.L);
        student1.printUniqueStudentID();
        student2.printUniqueStudentID();
        student1.printUniqueStudentID();
        System.out.println("============================");

        //Q4
        student2.printInfo();
        System.out.println("============================");

        //Q5
        System.out.println(isAFit(student1, top));
        System.out.println("============================");

        //Q6
        Manager manager = new Manager("Bowser", Size.M, 75000.0);
        HourlyEmployee employee = new HourlyEmployee("Donkey Kong", Size.S, 45.2f, 22.75);
        Business bizz = new Business("OnFleek Apparel", 150, 25.0);


        //Q7
        Customer[] customers = {student1, manager, employee};
        Cloth apparel = new Cloth("Coat", 50.75, Size.L);
        for(Customer customer: customers){
            customer.printPriceAfterDiscount(apparel);
        }
        System.out.println("============================");

        //Q8
        bizz.setProductPrice(-100);
        System.out.println(bizz.getProductPrice());

        System.out.println(bizz.calculatePay());
        System.out.println("============================");

        //Q9
        Payable[] payables = {bizz, manager, employee};
        printClassNamesOfPayableEntities(payables);
        System.out.println("============================");

        //Q10
        Employee managerToEmployee = new HourlyEmployee("Peaches", Size.S, 28.5f, 18.50);
        double hourlyWage = managerToEmployee.calculatePay();
        System.out.println(hourlyWage);



    }
}
