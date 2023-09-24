/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.restaurant;

import java.util.Scanner;

/**
 *
 * @author adria
 */
public class RestaurantMain {
    public static void main(String[] args) {
        char ulang;
        Scanner sc = new Scanner(System.in);
        int idMakanan; 
        int jumlahMakanan;
        Restaurant menu = new Restaurant();
        menu.tambahMenuMakanan("Bala-bala", 1_000, 20);
        menu.tambahMenuMakanan("Gehu", 1_000, 20);
        menu.tambahMenuMakanan("Tahu", 1_000, 30);
        menu.tambahMenuMakanan("Cireng", 1_000, 24);
        menu.tambahMenuMakanan("Batagor", 10_000, 20);
        menu.tambahMenuMakanan("Roti Bakar", 7_000, 10);
        menu.tambahMenuMakanan("Kwetiaw", 10_000, 10);
        menu.tambahMenuMakanan("Mie Kuah", 5_000, 5);
        menu.tambahMenuMakanan("Mie Goreng", 5_000, 5);
        menu.tambahMenuMakanan("Lele Goreng", 12_000, 3);
        do{
            menu.tampilMenuMakanan();
            System.out.print("Pilih menu (1-10) : ");
            idMakanan = sc.nextInt();
            System.out.print("Jumlah yang ingin dipesan : ");
            jumlahMakanan = sc.nextInt();
            menu.pesanMakanan(idMakanan, jumlahMakanan);
            System.out.print("Ingin memesan makanan lain (y\n): )");
            ulang = sc.next().charAt(0);
        }while(ulang == 'y' || ulang == 'Y');
    }
}
