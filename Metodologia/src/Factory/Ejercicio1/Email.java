package Factory.Ejercicio1;

public class Email implements Notification{

    @Override
    public void send() {
        System.out.println("You are sending an email.");
    }
    
}
