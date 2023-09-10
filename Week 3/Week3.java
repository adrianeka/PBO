/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.week3;

import java.util.Scanner;

/**
 *
 * @author adria
 */
public class Week3 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Masukkan operasi aritmatika: ");
        String str = sc.nextLine();
//        System.out.println(str);

        String[] token = str.split(" ");
        if (token.length == 3) {
            int num1 = Integer.parseInt(token[0]);
            char opr = token[1].charAt(0);
            int num2 = Integer.parseInt(token[2]);
            int hasil = 0;
            System.out.print(num1 + " " + opr + " " + num2 + " : ");
            switch(opr){
                case '+' -> hasil = num1 + num2;
                case '-' -> hasil = num1 - num2;
                case '/' -> hasil = num1 / num2;
                case '*' -> hasil = num1 * num2;
                case '%' -> hasil = num1 % num2;
                default -> System.out.println("Masukan operator yang valid (+,-,/,*,%)");
            }
            System.out.println(hasil);
        } else {
            System.out.println("Format input tidak sesuai. Gunakan format 'angka operator angka'.");
        }
        sc.close();
    }
}
