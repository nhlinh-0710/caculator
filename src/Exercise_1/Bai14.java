/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Exercise_1;

import java.util.Scanner;


public class Bai14 {
    
    static int[] arr;
    static Scanner sc = new Scanner(System.in);

    

    public int[] nhap() {
        System.out.println("Nhap do dai mang: ");
        int n = sc.nextInt();
        arr = new int[n]; 

        for (int i = 0; i < arr.length; i++) {
            System.out.println("Nhap ptu thu " + i + ": ");
            arr[i] = sc.nextInt();
        }
        return arr;
    }

    public void xuat() {
        System.out.println("Cac ptu trong mang la: ");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }

     public int fibonacci(int n) {
        if (n <= 1) {
            return n;
        }
        return fibonacci(n - 1) + fibonacci(n - 2);
    }
    
    public static void main(String[] args) {
        Bai14 b = new Bai14();
        b.nhap();
        b.xuat();

        System.out.println("Nhap svi tri fibinacci can tim: ");
        int n = sc.nextInt();
        int fib = b.fibonacci(n);
        System.out.println("So Fibonacci thu " + n + " la: " + fib);
    }
}
