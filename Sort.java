
public class Sort {
    public static int[] bubble(int[] arr) {
        int[] sorted = arr;
        for (int i = sorted.length - 1; i > 0; i--) {
            int counter = 0;
            for (int j = 0; j < i; j++) {
                if (sorted[j] > sorted[j + 1]) {
                    int temp = sorted[j + 1];
                    sorted[j + 1] = sorted[j];
                    sorted[j] = temp;
                }
                counter++;
            }
            System.out.println("Steps for Iteration: " + counter);
            Arrays.printElements(sorted);
            System.out.println();
        }
        return sorted;
    }

    public static int[] selection(int[] arr) {
        int[] sorted = arr;
        for (int i = 0; i < sorted.length - 1; i++) {
            int temp = sorted[i];
            int minIndex = i;
            for (int j = i; j < sorted.length; j++) {
                if (sorted[j] < sorted[minIndex]) {
                    minIndex = j;
                }
            }
            sorted[i] = sorted[minIndex];
            sorted[minIndex] = temp;

            Arrays.printElements(sorted);
            System.out.println();
        }
        return sorted;
    }

    public static int[] insertion(int[] arr) {
        int[] sorted = arr;
        for (int i = 1; i < sorted.length; i++) {
            int index = i;
            int j = i - 1;
            while(j >= 0 && sorted[index] < sorted[j]) {
                int temp = sorted[j];
                sorted[j]  = sorted[index];
                sorted[index] = temp;
                index = j;
                j--;
            }
            Arrays.printElements(sorted);
            System.out.println();
        }
        return sorted;
    }
}
