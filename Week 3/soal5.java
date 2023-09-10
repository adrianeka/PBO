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
public class soal5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Masukkan plat nomor : ");
        String input = sc.nextLine();
        String[] platNomor = input.split(" ");
        if (platNomor.length > 4) {
		System.out.println("invalid input!");
		return;
	}
        String stringPlatNomor = String.join("",platNomor);
        long totalPlatNomor = Long.parseLong(stringPlatNomor);
        if ((totalPlatNomor - 999999) % 5 != 0) {
            System.out.println("Berhenti");
        } else {
            System.out.println("Jalan");
        }
        
        sc.close();
    }
}
