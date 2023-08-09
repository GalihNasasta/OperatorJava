
import java.util.Scanner;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author galih
 */
public class KasirMakanan {
    public static void main(String[] args) {
        System.out.println("Menu Makanan:");
        System.out.println("1. Soto Ayam (15000)");
        System.out.println("2. Rawon Daging (17000)");
        System.out.println("3. Mie Goreng (5000)");
        
        int soto,rawon,mie,tahu,sate;
        soto=15000;
        rawon=17000;
        mie=5000;
        
        int jumlahBeli,total,bayar,kembali;
        
        Scanner input = new Scanner(System.in);
        System.out.println("Jumlah Beli Soto: ");
        int jumlahBeliSoto= input.nextInt();
        total=jumlahBeliSoto*soto;
        
        System.out.println("Jumlah Bali Rawon");
        int jumlahBeliRawon= input.nextInt();
        total+=jumlahBeliRawon*rawon;
        
        System.out.println("Jumlah Bali Mie Goreng: ");
        int jumlahBeliMieGoreng= input.nextInt();
        total+=jumlahBeliMieGoreng*mie;
        
        System.out.println("Total Pembelian: "+total);
        System.out.println("Masukkan Pembayaran:");
        bayar=input.nextInt();
        kembali=bayar-total;
        System.out.println("Jumlah Kembalian: "+kembali);
        
    }
    
}
