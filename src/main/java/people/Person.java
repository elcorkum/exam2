package people;

public abstract class Person {
    private String name;
    private final Size size;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Size getSize() {
        return size;
    }

    public Person(String name, Size size) {
        this.name = name;
        this.size = size;
    }

    public abstract void printInfo();
}
