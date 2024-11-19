

import java.lang.Math;
public class Arrays {
    public static void printElements(int[] array) {
        boolean firstPrinted = false;
        for (int num : array) {
            if (firstPrinted) System.out.print(", ");
            else firstPrinted = true;
            System.out.print(num);
        }
    }

    public static void printElements(double[] array) {
        for (double num : array) System.out.print(num + ", ");
    }

    public static boolean isInArray(int[] array, int target) {
        for (int num : array) if (num == target) return true;
        return false;
    }

    public static boolean isInArray(double[] array, double target) {
        for (double num : array) if (num == target) return true;
        return false;
    }

    public static double getStandardDeviation(int[] array) {
        double result = 0;
        double average = 0;

        for (int item : array) average += item;
        if (array.length != 0) average /= array.length;
    
        for (int item : array) result +=  (item - average) * (item - average);
        if (array.length != 0) result /= array.length;

        return Math.sqrt(result);
    }

    public static double getStandardDeviation(double[] array) {
        double result = 0;
        double average = 0;
        
        for (double item : array) average += item;
        if (array.length != 0) average /= array.length;
    
        for (double item : array) result +=  item - average;
        if (array.length != 0) result /= array.length;

        return result;
    }

    public static int getMax(int[] array) {
        int max = Integer.MIN_VALUE;
        for (int i : array) max = i > max ? i : max;
        return max;
    }

    public static double getMax(double[] array) {
        double max = Double.MIN_VALUE;
        for (double i : array) max = i > max ? i : max;
        return max;
    }

    public static int getMin(int[] array) {
        int min = Integer.MAX_VALUE;
        for (int i : array) min = i < min ? i : min;
        return min;
    }

    public static double getMin(double[] array) {
        double min = Double.MAX_VALUE;
        for (double i : array) min = i < min ? i : min;
        return min;
    }

    public static int[] getReverse(int[] array) {
        int[] result = new int[array.length];
        for (int i = 0; i < result.length; i++) {
            result[i] = array[array.length - 1 - i];
        }
        return result;
    }

    public static double[] getReverse(double[] array) {
        double[] result = new double[array.length];
        for (int i = 0; i < result.length; i++) {
            result[i] = array[array.length - 1 - i];
        }
        return result;
    }

    public static int[] reverse(int[] array) {
        for (int i = 0; i < array.length / 2; i++) {
            int temp = array[i];
            array[i] = array[array.length - (i + 1)];
            array[array.length - (i + 1)] = temp;
        }
        return array;
    }

    public static void displayIndexof(int[] array, int target) {
        boolean firstPrinted = false;
        boolean elementFound = false;
        for(int i = 0; i < array.length; i++) {
            if (array[i] == target) {
                if (firstPrinted) System.out.print(", ");
                else firstPrinted = elementFound = true;
                System.out.print(i);
            }
        }
        if(!elementFound) System.out.println("Element Not found");
        else System.out.println();
    }
}