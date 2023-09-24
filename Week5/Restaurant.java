/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.restaurant;

/**
 *
 * @author adria
 */
public class Restaurant {
    private String[] namaMakanan = new String[10];
    private double[] hargaMakanan = new double[10];
    private int[] stok = new int[10];
    private static byte id = 0;
    
    public String[] getNamaMakanan() {
        return namaMakanan;
    }

    public double[] getHargaMakanan() {
        return hargaMakanan;
    }

    public int[] getStok() {
        return stok;
    }

    public static byte getId() {
        return id;
    }
    
    public void tambahMenuMakanan (String nama, double harga, int stok){
        this.namaMakanan[id] = nama;
        this.hargaMakanan[id] = harga;
        this.stok[id] = stok;
        nextid();
    }
    
    public boolean isOutOfStock(int id){
        return stok[id] == 0;
    }
    
    public void pesanMakanan(int index, int jumlah){
        if (jumlah <= this.stok[index-1]){
            this.stok[index-1] -= jumlah;
        }else{
            System.out.println("Stok tidak cukup");
        }
    }
    
    public void tampilMenuMakanan(){
        System.out.println("===================================");
        for (int i = 0 ; i < id; i++){
            if(!isOutOfStock(i)){
                System.out.println((i+1)+".\t "+namaMakanan[i] + "["+ stok[i]+ "]\t Rp." +hargaMakanan[i]);
            }
        }
        System.out.println("===================================");
    }
    
    public static void nextid(){
        id++;
    }
}
