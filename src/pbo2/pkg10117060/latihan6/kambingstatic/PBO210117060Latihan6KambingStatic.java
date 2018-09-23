/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pbo2.pkg10117060.latihan6.kambingstatic;

/**
 *
 * @author 
 * NAMA : Irfan Faisal Hutama Tanjung.
 * KELAS : PBO2
 * NIM : 10117060
 * Deskripsi Program : Program ini berisi bagaimana caranya mengimplementasikan
 * dengan 2 class yg berbeda.
 */

public class PBO210117060Latihan6KambingStatic {

    /**
     * @param args the command line arguments
     */
    public static final String NAMA_KAMBING = "MIDUN";
    
    public static void main(String[] args) {
        Mamalia.jumlahKambing = 485000;
        System.out.println(NAMA_KAMBING + " Memiliki kambing sebanyak " + Mamalia.jumlahKambing);
    }
    
}
