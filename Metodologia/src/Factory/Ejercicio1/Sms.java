package Factory.Ejercicio1;

public class Sms implements Notification{

    @Override
    public void send() {
        System.out.println("You are sending an SMS.");
    }
    
}
