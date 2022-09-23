import java.lang.Character;

public class Lab5 {
    public static float minimum(float a, float b) {
        return a < b ? a : b;
    }

    public static String reverse(String text) {
        char[] charText = new char[text.length()];
        for (int i = text.length() - 1; i >= 0; i--) {
            charText[text.length() - 1 - i] = text.charAt(i);
        }

        return new String(charText);
    }

    public static boolean Exercise3_java(String number) {
        boolean isStartNumber = false;
        boolean isFinishNumber = false;
        number = number.replace("-", "");
        char[] array = number.toCharArray();
        for (int i = 0; i < number.length(); i++) {
            if (Character.isDigit(array[i]))
                isStartNumber = true;

            if (isStartNumber && !Character.isDigit(array[i])) {
                isFinishNumber = true;
            }

            if (isStartNumber && !Character.isDigit(array[i]) && isFinishNumber)
                isStartNumber = false;

            if (isFinishNumber && isStartNumber)
                return false;
        }
        return true;
    }
}
