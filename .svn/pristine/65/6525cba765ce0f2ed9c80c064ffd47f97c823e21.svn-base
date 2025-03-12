/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Exercise_1;

/**
 *
 * @author linh0
 */
import java.util.Arrays;
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class ArrayStringUtils {

    static int[] arr;
    static Scanner sc = new Scanner(System.in);

    // 1: Calculate the sum of an array
    public int sumArray(int[] arr) {
        int sum = 0;
        for (int num : arr) {
            sum += num;
        }
        return sum;
    }

    // 2: Sort the array in ascending order
    public void sortArray(int[] arr) {
        Arrays.sort(arr);
    }

    // 3: Find the largest number in the array
    public int findMax(int[] arr) {
        int max = arr[0];
        for (int num : arr) {
            if (num > max) {
                max = num;
            }
        }
        return max;
    }

    // 4: Reverse the sequence
    public void reverseArray(int[] arr) {
        int left = 0, right = arr.length - 1;
        while (left < right) {
            int temp = arr[left];
            arr[left] = arr[right];
            arr[right] = temp;
            left++;
            right--;
        }
    }

    // 5: Checking prime numbers
    public boolean isPrime(int num) {
        if (num < 2) {
            return false;
        }
        for (int i = 2; i <= Math.sqrt(num); i++) {
            if (num % i == 0) {
                return false;
            }
        }
        return true;
    }

    // 6: Remove duplicate elements in the array
    public int[] removeDuplicates(int[] arr) {
        Set<Integer> set = new HashSet<>();
        for (int num : arr) {
            set.add(num);
        }
        return set.stream().mapToInt(Integer::intValue).toArray();
    }

    // 7: Count the number of words in a string
    public int countWords(String str) {
        if (str == null || str.isEmpty()) {
            return 0;
        }
        String[] words = str.trim().split("\\s+");
        return words.length;
    }

    // 8: Input array from user
    public int[] nhap() {
        System.out.println("Nhap do dai mang: ");
        int n = sc.nextInt();
        arr = new int[n];

        for (int i = 0; i < arr.length; i++) {
            System.out.println("Nhap Ptu thu " + i + ": ");
            arr[i] = sc.nextInt();
        }
        return arr;
    }

    // 9: Output array
    public void xuat() {
        System.out.println("Cac Ptu trong mang: ");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        ArrayStringUtils utils = new ArrayStringUtils();

        // Input array
        utils.nhap();
        utils.xuat();

        // Sample text for counting words
        String text = "Hello world! This is a test string.";

        // Sum of array
        System.out.println("Sum of array: " + utils.sumArray(arr));

        // Sort array
        utils.sortArray(arr);
        System.out.println("Sorted array: " + Arrays.toString(arr));

        // Find max in array
        System.out.println("Largest number in array: " + utils.findMax(arr));

        // Reverse array
        utils.reverseArray(arr);
        System.out.println("Reversed array: " + Arrays.toString(arr));

        // Check prime numbers
        System.out.println("Check if 7 is prime: " + utils.isPrime(7));
        System.out.println("Check if 10 is prime: " + utils.isPrime(10));

        // Remove duplicates in array
        int[] uniqueArr = utils.removeDuplicates(arr);
        System.out.println("Array after removing duplicates: " + Arrays.toString(uniqueArr));

        // Count words in string
        System.out.println("Word count in string: " + utils.countWords(text));
    }
}
