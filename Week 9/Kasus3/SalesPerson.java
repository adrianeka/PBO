/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Kasus3;

/**
 *
 * @author adria
 */
public class SalesPerson implements Comparable {
    private String firstName, lastName;
    private int totalSales;
    
    public SalesPerson(String first, String last, int sales){
        firstName = first;
        lastName = last;
        totalSales = sales;
    }
    
    @Override
    public String toString(){
        return lastName + ", " + firstName + ": \t" + totalSales; 
    }
    
    @Override
    public boolean equals(Object other) {
            return (this.lastName.equals(((SalesPerson)other).getLastName()) 
                    && this.firstName.equals(((SalesPerson)other).getFirstName()));
    }
    
    @Override
    public int compareTo(Object o) {
        int result = 0;
        if(this.totalSales > ((SalesPerson)o).getTotalSales()){
            result = 1;
        }else if(this.totalSales < ((SalesPerson)o).getTotalSales()){
            result = -1;
        }else{
            String name = firstName + lastName;
            String objName = ((SalesPerson)o).getFirstName() + ((SalesPerson)o).getLastName();
            if(name.compareTo(objName)<0){
                result = 1;
            }else{
                result = -1;
            }
        }
        return result;
    }


    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public int getTotalSales() {
        return totalSales;
    }
    
}
