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
public class soal4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int gajiPokok = 500000;
        int item = 50000;
        System.out.print("Jumlah item terjual : ");
        int itemTerjual = sc.nextInt();
        double bonus = 0;
        double denda = 0;
        if(itemTerjual > 80){
            bonus = 0.35 * (itemTerjual * item);
        }else if(itemTerjual >= 40){
            bonus = 0.25 * (itemTerjual * item);
        }else if(itemTerjual < 15){
            denda = 0.15 * ((153-itemTerjual) * item);
        }else{
            bonus = 0.10 * (itemTerjual * item);
        }
        double totalPendapatan = gajiPokok + bonus - denda;
        System.out.println("Total Pendapatan : " + totalPendapatan);
        sc.close();
    }
}
