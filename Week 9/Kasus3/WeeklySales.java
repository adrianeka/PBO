/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Kasus3;

/**
 *
 * @author adria
 */
public class WeeklySales {
    public static void main(String[] args){
        SalesPerson[] salesStaff = new SalesPerson[10];
        
        salesStaff[0] = new SalesPerson("Jane", "Jones", 3000);
        salesStaff[1] = new SalesPerson("Daffy", "Duck", 4935);
        salesStaff[2] = new SalesPerson("James", "Jones", 3000);
        salesStaff[3] = new SalesPerson("Dick", "Walter", 2800);
        salesStaff[4] = new SalesPerson("Don", "Trump", 1570);
        salesStaff[5] = new SalesPerson("Jane", "Black", 3000);
        salesStaff[6] = new SalesPerson("Harry", "Taylor", 7300);
        salesStaff[7] = new SalesPerson("Andy", "Adams", 5000);
        salesStaff[8] = new SalesPerson("Jim", "Doe", 2850);
        salesStaff[9] = new SalesPerson("Watt", "Smith", 3000);
        
        Sorting.selectionSort(salesStaff);
        
        System.out.println("\nRanking of Sales for the week\n");
        
        for(SalesPerson s : salesStaff){
            System.out.println(s);
        }
    }
}
