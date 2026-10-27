package Factory.Ejercicio1;

public class Main {
    public static void main(String[] args) {

       Notification notification = NotificationFactory.create("email");
       Notification notification2 = NotificationFactory.create("sms");

       notification.send();
       notification2.send();
    }
}
