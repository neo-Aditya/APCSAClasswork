public class FourDigitInteger {
    private int value;

    public FourDigitInteger(int aValue) throws Exception{
        if (aValue < 1000 || aValue > 9999) throw new Exception("Invalid input");
        value = aValue;
    }

    public boolean isOdd() {
        return (value % 2) == 1;
    }

    public boolean isPalindrome() {
        int reverse = 0;
        int temp = value;
        while (temp != 0) {
            reverse *= 10;
            reverse += temp % 10;
            temp /= 10;
        }

        return reverse == value; 
    }

    public boolean isPerfectSquare() {
        return (Math.sqrt(value) % 1) == 0;
    }
}
