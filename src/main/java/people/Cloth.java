package people;

public class Cloth {
    private String name;
    private double price;
    private final Size size;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        if (price > 0) {
            this.price = price;
        }

    }

    public Size getSize() {
        return size;
    }


    public Cloth(String name, double price, Size size){
        this.name = name;
        this.price = price;
        this.size = size;
    }
}
