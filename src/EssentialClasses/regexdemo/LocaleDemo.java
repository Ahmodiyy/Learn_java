package EssentialClasses.regexdemo;

import java.util.Locale;
import java.util.ResourceBundle;
public class LocaleDemo {

    public static void main(String[] args) {

        ResourceBundle resourceBundle =
              ResourceBundle.getBundle("germ", new Locale("de", "DE"));
        System.out.println(resourceBundle.getString("Welcome"));
        ResourceBundle resourceBundle2 =
                ResourceBundle.getBundle("germ", new Locale("fr", "FR"));
        System.out.println(resourceBundle2.getString("Welcome"));

    }
}
