package L20;

public class AdminUser extends User {

    public AdminUser(String username, String email) {
        super(username, email);
    }

    public void manageProducts() {

        System.out.println("Admin is managing products");

    }

    public void updateUsername() {

        System.out.println(username + "'s username needs to be updated");
    }

    @Override
    public void showDashboard() {
        super.showDashboard();
        System.out.println("Admin user specialised dashboard");
    }

    public static void main(String[] args) {
        AdminUser au = new AdminUser("riya98", "riya98@gmail.com");
        au.login();
        au.showDashboard();

    }
}
