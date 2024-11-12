
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
}
