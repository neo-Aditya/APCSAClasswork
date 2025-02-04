public class Strings {
    final static char[] vowels = {'A', 'E', 'I', 'O', 'U'};
    final static char[] consonants = {'B', 'C', 'D', 'E', 'F', 'G', 'H', 'J', 'K', 'L', 'M', 'N', 'P', 'Q', 'R', 'S', 'T', 'V', 'W', 'X', 'Y', 'Z'};
    final static char[] numbers = {'0', '1', '2', '3', '4', '5', '6', '7', '8', '9'};

    public static boolean isPalindrome(String s) {
        char[] temp = s.toCharArray();
        for (int i = 0; i < (temp.length / 2); i++) {
            if (temp[i] != temp[s.length() - 1 - i]) {
                return false;
            }
        }
        return true;
    }

    public static int numValue(String s, char[] collection) {
        char[] temp = s.toCharArray();
        int numValue = 0;
        for (char character : temp) 
            for (char value : collection) 
                if (character == value) numValue++;
        return numValue;
    }

    public static int numVowels(String s) {
        return numValue(s.toUpperCase(), vowels);
    }

    public static int numConsonants(String s) {
        return numValue(s.toUpperCase(), consonants);
    }

    public static int numNumbers(String s) {
        return numValue(s, numbers);
    }

    public static int length(String s) {
        return s.length();
    }

}
