package L21;

public class OnlineStore {

    public static void main(String[] args) {

        Product electronics = new Electronics("Smartphone", 500);
        Product clothing = new Electronics("T-shirt", 200);

        System.out.println(electronics.calculateTax());
        System.out.println(clothing.calculateShippingCost());

    }
}
