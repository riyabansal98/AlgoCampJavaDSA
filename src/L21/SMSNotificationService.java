package L21;

public class SMSNotificationService implements  NotificationService{

    private String phoneNumber;

    public SMSNotificationService(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }


    public void sendNotifications(String message) {
        System.out.println("Sending notification to " + phoneNumber);
    }

    public void subscribeToTopic(String topic) {
        System.out.println("subscribed " + phoneNumber + " to email notifications for topic: " + topic);
    }
}

