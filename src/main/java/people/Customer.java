package people;

public abstract class Customer extends Person{
    private Cloth[] clothingItems;

    public Cloth[] getClothingItems() {
        return clothingItems;
    }

    public void setClothingItems(Cloth[] clothingItems) {
        this.clothingItems = clothingItems;
    }

    public Customer(String name, Size size) {
        super(name, size);
    }

    public abstract void printPriceAfterDiscount(Cloth cloth);
}
