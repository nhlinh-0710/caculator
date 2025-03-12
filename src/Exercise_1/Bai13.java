/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Exercise_1;

import static Exercise_1.Bai12.countDigits;
import java.util.Scanner;


public class Bai13 {
    public static boolean checkArmstrong(int n) {
        int originalNumber = n;
        int sum = 0;
        int numDigits = countDigits(n);

        while (n != 0) {
            int digit = n % 10;
            sum += Math.pow(digit, numDigits);
            n /= 10;
        }

        return sum == originalNumber;
    }
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhap so nguyen: ");
        int n = sc.nextInt();
        
        boolean isArmstrong = checkArmstrong(n);
        if (isArmstrong) {
            System.out.println(n + " la so Armstrong.");
        } else {
            System.out.println(n + " Khong Phai.");
        }

        
        
    }
}
