import java.lang.Character;
import javax.swing.*;
public class Lab4 {
    public static boolean isDigit(String digit) {
        for (int i = 0; i < digit.length(); i++) {
            if (!Character.isDigit(digit.toCharArray()[i])) {
                return false;
            }
        }
        return true;
    }

    public static boolean Authentication(String username, String password) {
        String validUsername = "Joe";
        String validPassword = "t123456";
        if (validUsername.equalsIgnoreCase(username) && password == validPassword) {
            return true;
        }
        return false;
    }
}
