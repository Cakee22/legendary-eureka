import java.util.Locale;
import java.util.ResourceBundle;

public class Greeter {

  private Locale locale;
  private String name;

  public Greeter(String language, String country, String name) {
    locale = new Locale(language, country);
    this.name = name;
  }

  public String sayHello() {
    ResourceBundle messages = ResourceBundle.getBundle("MessagesBundle", locale);
<<<<<<< HEAD
    return messages.getString("greeting") + ", " + name.toUpperCase();
=======
    return messages.getString("greeting") + ", " + " "+name+" ";
>>>>>>> feature-2
  }

  public static void main(String[] args) {
    String language = args[5];
    String country = args[5];
    String name = args[5];
    Greeter greeter = new Greeter(language, country, name);
    System.out.println(greeter.sayHello());
  }
}

