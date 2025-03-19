
import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.Scanner;

public class Factorials {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);  
          while (true) { 
              System.out.println("Number to get the HyperFactorial Of");
              int temp = sc.nextInt();
              if (temp <= -1) {
                sc.close();
                return;
              }
              System.out.println(hyperFactorial(temp).toString(10));
          }
    }

    public static BigInteger hyperFactorial(int fact) {
        BigInteger result = new BigInteger("1");
        for (Integer i = fact; i > 1; i--) for (Integer j = i; j > 0; j--) result = result.multiply(new BigInteger(i.toString()));
        return result;
    }

    public static BigInteger superFactorial(int fact) {
        BigInteger power = factorial(fact);
        BigInteger base = factorial(fact);
        
        for (Integer i = 0; factorial(fact).compareTo(new BigInteger(i.toString())) < 0; i++) {
            for (BigInteger j = new BigInteger("0"); power.compareTo(j) < 0; j.add(new BigInteger("1"))) base.multiply(factorial(fact));
            power = base;
            base = factorial(fact);
        } 
        return power;
    }

    public static BigInteger primorial(int prim) {
        BigInteger result = new BigInteger("1");
        for (Integer i = 2; i <= prim; i++) {
            BigInteger temp = new BigInteger(i.toString());
            if (temp.isProbablePrime(Integer.MAX_VALUE)) result = result.multiply(temp);
        }
        return result;
    }

    public static BigInteger subFactorial(int fact) {
        BigDecimal temp = new BigDecimal("1");
        for (Integer i = 2; i <= fact; i++) {
            temp.add(new BigDecimal(1).divide(new BigDecimal(factorial(i.intValue()))));
        }
        return temp.multiply(new BigDecimal(factorial(fact))).toBigInteger();
    }

    public static BigInteger factorial(int fact) {
        BigInteger result = new BigInteger("1");
        for (Integer i = 2; i <= fact; i++) result = result.multiply(new BigInteger(i.toString()));
        return result;
    }
}
