/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Exercise_1;

import java.util.Scanner;


public class Bai11 {
    
    public static int TimGCD(int a, int b) {
        if (b == 0) {
            return a;
        }
        return TimGCD(b, a % b);
    }
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhap so thu nhat: ");
        int a= sc.nextInt();
        System.out.println("Nhap so thu hai: ");
        int b = sc.nextInt();
        
        int gcd = TimGCD(a, b);
        System.out.println("Uoc chung lon nhat la " + gcd);
        
        
                
        
    }
    
    
            
}
