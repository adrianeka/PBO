/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.week3;

import java.math.BigInteger;
import java.util.Scanner;

/**
 *
 * @author adria
 */
public class soal6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String num1 = sc.nextLine();
        String num2 = sc.nextLine();
        
        if(num1.length() > 200 || num2.length() > 200){
            System.out.println("The maximum is 200 digits");
            return;
        }

        BigInteger a = new BigInteger(num1);
        BigInteger b = new BigInteger(num2);
        
        BigInteger sum = a.add(b);
        BigInteger product = a.multiply(b);

        System.out.println(sum);
        System.out.println(product);

        sc.close();
    }
}
