package Factory.Ejercicio1;

public class NotificationFactory {
 public static Notification create(String type){
    if(type.toLowerCase().equals("email")){
        return new Email();
    }
    if(type.toLowerCase().equals("sms")){
        return new Sms();
    }
    return null;
 }
}
