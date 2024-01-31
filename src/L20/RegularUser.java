package L20;

public class RegularUser extends User{

    public RegularUser(String username, String email) {
        super(username, email);
    }

    public void browseProducts() {
        System.out.println("Customer is browsing products");
    }

    @Override
    public void showDashboard() {
        System.out.println("Regular user personalised dashboard");
    }

}
