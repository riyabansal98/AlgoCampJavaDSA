package L21;

abstract class Product {

    protected String name;
    protected double price;

    public Product(String name, double price) {

        this.name = name;
        this.price = price;
    }

    abstract double calculateDiscount();
    abstract double calculateTax();
    abstract double calculateShippingCost();
}
