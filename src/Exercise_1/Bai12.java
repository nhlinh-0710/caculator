/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Exercise_1;

import java.util.Scanner;

public class Bai12 {

    public static int countDigits(int n) {
        int count = 0;
        while (n != 0) {
            n /= 10;
            count++;
        }
        return count;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhap so nguyen: ");
        int n = sc.nextInt();

        int digitCount = countDigits(n);
        System.out.println("So chu so cua " + n + " la: " + digitCount);

    }
}
