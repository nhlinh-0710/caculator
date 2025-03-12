/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Exercise_1;

import java.util.Scanner;

/**
 *
 * @author linh0
 */
public class Bai10 {

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

    public int timKiem(int x) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == x) {
                return i; 
            }
        }
        return -1; 
    }
    
    public static void main(String[] args) {
        Bai10 b = new Bai10();
        b.nhap();
        b.xuat();

        System.out.println("Nhap ptu can tim: ");
        int x = sc.nextInt();
        int index = b.timKiem(x);
        if (index != -1) {
            System.out.println("Ptu " + x + " duoc tim thay tai vi tri: " + index);
        } else {
            System.out.println("Khong tim thay");
        }
    }
}
