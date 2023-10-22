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
public class Numbers {
    public static void main(String[] args){
        Integer[] intList;
        int size;
        
        Scanner scan = new Scanner(System.in);
        System.out.println("\nHow many integers do you want to sort? ");
        size = scan.nextInt();
        intList = new Integer[size];
        
        System.out.println("\nEnter the number...");
        for(int i = 0; i < size; i++){
            intList[i] = scan.nextInt();
        }
//        Sorting.selectionSort(intList);
//        System.out.println("\nYour numbers in sorted order...");
//        for(int i = 0; i < size; i++){
//            System.out.println(intList[i] + " ");
//        }
//        Sorting.insertionSort(intList);
//        System.out.println("\nYour numbers in sorted order...");
//        for(int i = 0; i < size; i++){
//            System.out.println(intList[i] + " ");
//        }
        Sorting.insertionSortDesc(intList);
        System.out.println("\nYour numbers in sorted order...");
        for(int i = 0; i < size; i++){
            System.out.println(intList[i] + " ");
        }
        System.out.println();
    }
}
