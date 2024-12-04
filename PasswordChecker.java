public class PasswordChecker {
    public static int numDigits(String s) {
        int numDigits = 0;
        for (int i = 0; i < s.length(); i++) {
            int symbol = (int) s.charAt(i);
            if (symbol >= 48 && symbol <= 56) numDigits++;
        }
        return numDigits;
    }

    public static int numLetters(String s) {
        int numDigits = 0;
        for (int i = 0; i < s.length(); i++) {
            int symbol = (int) s.charAt(i);
            if ((symbol >= 65 && symbol <= 90) || (symbol >= 97 && symbol <= 122)) numDigits++;
        }
        return numDigits;
    }

    public static int numSymbols(String s) {
        return (s.length() - numLetters(s) - numDigits(s));
    }

    public static String PasswordStrength(String s) {
        if (s.length() >= 8 && numDigits(s) > 0 && numLetters(s) > 0 && numSymbols(s) > 0) return "strong";
        if ((s.length() >= 5 && numSymbols(s) > 0) || s.length() >= 8) return "medium";
        return "weak";
    }
}
