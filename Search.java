public class Search {
    public static int binary(int[] array, int target) {
        int index = array.length / 2;
        int counter = 1;
        while (index > 0 && index < (array.length - 1) && array[index] != target) {
            counter++;
            if (array[index] > target) {
                if (array[index - 1]  < target) {
                    System.out.println("Target not located in array");
                    System.out.println("Iterations: " + (counter - 1));
                    return -1;
                }
                index -= array.length / (2 * counter);
            }
            else {
                if (array[index + 1]  < target) {
                    System.out.println("Target not located in array");
                    System.out.println("Iterations: " + (counter - 1));
                    return -1;
                }
                index += array.length / (2 * counter);
            }
        }
        if (array[index] != target) {
            System.out.println("Target not located in array");
            System.out.println(counter - 1);
            return -1;
        }
        System.out.println("Iterations: " + (counter - 1));
        return index;
    }

    public static int linear(int[] array, int target) {
        for (int i = 0; i < array.length; i++) if (array[i] == target) return i;
        System.out.println("Target not located in array");
        return -1;
    }
}
