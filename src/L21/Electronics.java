package L21;

public class Electronics extends Product{

    public Electronics(String name, double price) {
        super(name, price);
    }
    @Override
    double calculateDiscount() {
        return price * 0.1;
    }

    @Override
    double calculateTax() {
        return price * 0.15;
    }

    @Override
    double calculateShippingCost() {
        return 10.0;
    }
}
