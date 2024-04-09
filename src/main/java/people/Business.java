package people;

public class Business implements Payable{
    private String name;
    private int productQtySupplied;
    private double productPrice;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getProductQtySupplied() {
        return productQtySupplied;
    }

    public void setProductQtySupplied(int productQtySupplied) {
        if (productQtySupplied >= 0) {
            this.productQtySupplied = productQtySupplied;
        }

    }

    public double getProductPrice() {
        return productPrice;
    }

    public void setProductPrice(double productPrice) {
        if (productPrice >= 0) {
            this.productPrice = productPrice;
        }

    }

    public Business(String name, int productQtySupplied, double productPrice){
        this.name = name;
        this.productPrice = productPrice;
        this.productQtySupplied = productQtySupplied;
    }

    @Override
    public double calculatePay() {
        return this.productQtySupplied * this.productPrice;
    }
}
