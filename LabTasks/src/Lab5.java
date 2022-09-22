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
}
