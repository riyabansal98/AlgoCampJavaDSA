package L21;

public class NotificationExample {
    public static void main(String[] args) {
        NotificationService emailService = new EmailService("user@example.com");
        NotificationService smsService = new SMSNotificationService("+1234567890");

        emailService.sendNotifications("Hello, this is an email notification.");
        smsService.sendNotifications("Hi there, this is an SMS notification.");

        emailService.subscribeToTopic("News");
        smsService.subscribeToTopic("Alerts");
    }
}
