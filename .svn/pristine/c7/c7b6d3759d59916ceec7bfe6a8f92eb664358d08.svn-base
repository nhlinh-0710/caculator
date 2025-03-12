/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Exercise_1;

import static Exercise_1.Bai12.countDigits;
import java.util.Scanner;

/**
 *
 * @author linh0
 */
public class Bai15 {

    public static boolean checkPalindrome(int n) {
        int originalNumber = n;
        int reversedNumber = 0;
        while (n != 0) {
            int digit = n % 10;
            reversedNumber = reversedNumber * 10 + digit;
            n /= 10;
        }
        return originalNumber == reversedNumber;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhap so nguyen: ");
        int n = sc.nextInt();

        boolean isPalindrome = checkPalindrome(n);
        if (isPalindrome) {
            System.out.println(n + " la so Palindrome.");
        } else {
            System.out.println(n + " Khong phai.");
        }
    }
}
