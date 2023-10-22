package Kasus3;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author adria
 */
public class Sorting {
    public static void selectionSort(Comparable[] list){
        int min;
        Comparable temp;
        
        for (int index = 0; index < list.length-1; index++){
            min = index;
            for(int scan = index+1; scan < list.length; scan++)
                if(list[scan].compareTo(list[min]) < 0)
                    min = scan;
            temp = list[min];
            list[min] = list[index];
            list[index] = temp;
        }
    }
    
    public static void insertionSort(Comparable[] list){
        for(int i = 1; i < list.length; i++){
            Comparable key = list[i];
            int position = i;
            
            while(position > 0 && key.compareTo(list[position-1]) < 0){
                list[position] = list[position - 1];
                position--;
            }
            list[position] = key;
        }
    }
    
    public static void insertionSortDesc(Comparable[] list){
        for(int i = 1; i < list.length; i++){
            Comparable key = list[i];
            int position = i;
            
            while(position > 0 && key.compareTo(list[position-1]) > 0){
                list[position] = list[position - 1];
                position--;
            }
            list[position] = key;
        }
    }
}
