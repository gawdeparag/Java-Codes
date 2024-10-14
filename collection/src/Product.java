public class Product {
    private String name;
    private float number;

    public Product(String name, float number) {
        this.name = name;
        this.number = number;
    }

    public Product() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public float getNumber() {
        return number;
    }

    public void setNumber(float number) {
        this.number = number;
    }
}
