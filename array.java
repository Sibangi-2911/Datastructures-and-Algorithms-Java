import java.util.*;

public class array {
    public static int linearSearch(int[] numbers, int key) {
        for (int i = 0; i < numbers.length; i++) { // Loop through the array
            if (numbers[i] == key) {
                return i; // Return the index if the key is found
            }
        }
        return -1; // Return -1 if the key is not found
    }

    public static int[] getLargestSmallest(int[] numbers) {
        int largest = Integer.MIN_VALUE;
        int smallest = Integer.MAX_VALUE;

        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] > largest) {
                largest = numbers[i];
            }
            if (numbers[i] < smallest) {
                smallest = numbers[i];
            }
        }

        return new int[]{largest, smallest};
    }

    public static void main(String[] args) {
        int[] numbers = {2, 4, 6, 8, 10, 12};
        int key = 10;

        int index = linearSearch(numbers, key);
        if (index == -1) {
            System.out.println("Not found");
        } else {
            System.out.println("Found at index: " + index);
        }

        int[] result = getLargestSmallest(numbers);
        System.out.println("Largest: " + result[0]);
        System.out.println("Smallest: " + result[1]);
    }
}