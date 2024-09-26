public class Calculator{

    public static long factorialCalc(long n) {
        if (n <= 0) return 1;
        long output = 1;
        for (long i = 1; i <= n; i++) {
            output *= i;
        }
        return output;
    }

    public static long[] firstOdds(int n) {
        if (n <= 0) return new long[1];
        long[] output = new long[n];
        output[0] = 1L;
        for(int i = 1; i < n ; i++) {
            output[i] = output[i - 1] + 2;
        }
        return output;
    }

    public static long[] oddsTill(int n) {
        if (n <= 0) return new long[1];
        long[] output = new long[(n / 2) + n % 2];
        output[0] = 1L;
        for(int i = 1; i < n ; i++) {
            output[i] = output[i - 1] + 2;
        }
        return output;
    }

    public static long firstNaturalSum(long n) {
        long sum = 0;
        for (long i = 1; i <= n; i++) {
            sum += i;
        }
        return sum;
    }

    public static long[] firstFibonacci(int n) {
        if (n <= 0) return new long[1];
        long[] output = new long[n];
        output[0] = 0L;
        output[1] = 1L;
        for(int i = 2; i < n ; i++) {
            output[i] = output[i - 1] + output[i - 2];
        }
        return output;
    }
}