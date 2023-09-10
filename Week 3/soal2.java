/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.week3;

import java.util.Scanner;

/**
 *
 * @author adria
 */
public class soal2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Input Line : ");
        int line = sc.nextInt();
        sc.nextLine();
        System.out.println(line);
        String str[] = new String[line];
        
        for(int i = 0; i < line; i++){
            str[i] = sc.nextLine();
        }
        
        System.out.println("==============================");
        for(String strVal : str){
            String token[] = strVal.split(" ");
            int num = Integer.parseInt(token[1]);
            System.out.printf("%-15s %03d%n", token[0], num); // Menggunakan System.out.printf untuk format output
        }
        System.out.println("==============================");
        
        sc.close();
    }
}
