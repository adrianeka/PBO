/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Kasus3;

import java.util.Scanner;

/**
 *
 * @author adria
 */
public class Strings {
    public static void main(String[] args){
        String[] stringList;
        int size;
        
        Scanner scan = new Scanner(System.in);
        System.out.println("\nHow many strings do you want to sort? ");
        size = scan.nextInt();
        stringList = new String[size];
        
        System.out.println("\nEnter the string...");
        for(int i = 0; i < size; i++){
            stringList[i] = scan.next();
        }
        Sorting.selectionSort(stringList);
        System.out.println("\nYour strings in sorted order...");
        for(int i = 0; i < size; i++){
            System.out.println(stringList[i] + " ");
        }
        System.out.println();
    }
}
