import java.util.Arrays;
import java.util.Random;

public class ComplexArrayProgram {
    public static void main(String[] args) {
        // Generate an array of random integers
        int[] arr = new int[20];
        Random rand = new Random();
        for (int i = 0; i < arr.length; i++) {
            arr[i] = rand.nextInt(100);
        }

        // Find the maximum and minimum values
        int max = arr[0];
        int min = arr[0];
        for (int num : arr) {
            if (num > max) {
                max = num;
            }
            if (num < min) {
                min = num;
            }
        }

        // Calculate the average
        double sum = 0;
        for (int num : arr) {
            sum += num;
        }
        double average = sum / arr.length;

        // Sort the array
        Arrays.sort(arr);

        // Calculate the median
        double median;
        if (arr.length % 2 == 0) {
            int mid1 = arr.length / 2 - 1;
            int mid2 = arr.length / 2;
            median = (arr[mid1] + arr[mid2]) / 2.0;
        } else {
            int mid = arr.length / 2;
            median = arr[mid];
        }

        // Calculate the sum of all elements
        sum = 0;
        for (int num : arr) {
            sum += num;
        }

        // Display the results
        System.out.println("Original Array: " + Arrays.toString(arr));
        System.out.println("Maximum Value: " + max);
        System.out.println("Minimum Value: " + min);
        System.out.println("Average: " + average);
        System.out.println("Sorted Array: " + Arrays.toString(arr));
        System.out.println("Median: " + median);
        System.out.println("Sum of All Elements: " + sum);
    }
}
