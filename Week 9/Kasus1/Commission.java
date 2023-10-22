/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Kasus1;

/**
 *
 * @author adria
 */
public class Commission extends Hourly{
    private double totalSales;
    private double comissionRate;
    
    public Commission(String eName, String eAddress, String ePhone,
                  String socSecNumber, double rate, double rateCommission){
        super(eName, eAddress, ePhone, socSecNumber, rate);
        this.comissionRate = rateCommission;
    }
    
    public void addSales(double totalSales){
        this.totalSales = totalSales;
    }

    @Override
    public double pay()
   {
      double payment = super.pay() + (totalSales * comissionRate);
      totalSales = 0;
      return payment;
   }
    
    @Override
   public String toString()
   {
      String result = super.toString();
      result += "\nTotal Sales: " + totalSales;
      return result;
   }
}
