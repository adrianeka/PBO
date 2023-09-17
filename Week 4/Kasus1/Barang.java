/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package Kasus1;

/**
 *
 * @author adria
 */
public class Barang {

    String kode_barang;
    String nama_barang;
    private int stok;
    public Barang(String kode, String nama, int stk) {
        kode_barang = kode;
        nama_barang = nama;
        stok = stk;
    }
    
    public void tambahBarang(int angka){
        this.stok += angka;
    }
    
    public int getBarang(){
        return this.stok;
    }
}
