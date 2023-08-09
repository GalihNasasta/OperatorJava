/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author galih
 */
public class OperatorAritmatika {
    public static void main(String[] args) {
        
        int bilangan1=13;
        int bilangan2=5;
        
        int hasilPenjumlahan = bilangan1+bilangan2;
        int hasilPengurangan = bilangan1-bilangan2;
        int hasilPembagian = bilangan1/bilangan2;
        int hasilPerkalian = bilangan1*bilangan2;
        int hasilModulus = bilangan1%bilangan2;
        
//        System.out.println("Bilangan 1: "+bilangan1);
//        System.out.println("Bilangan 2: "+bilangan2);
//        
//        System.out.println("Hasil Penjumlahan= 1"+hasilPenjumlahan);
//        System.out.println("Hasil Pengurangan= "+hasilPengurangan);
//        System.out.println("Hasil Pembagian= "+hasilPembagian);
//        System.out.println("Hasil Perkalian= "+hasilPerkalian);
//        System.out.println("Hasil Modulus= "+hasilModulus);

        double nilaiMat = 80.9;
        double nilaiProduktif = 99.89;
        double nilaiInformatika = 95.78;
        double nilaiPkn = 94.90;
        
        double nilaiRata = (nilaiMat+nilaiProduktif+nilaiInformatika+nilaiPkn)/4;
        
//        System.out.println("Nilai Rata-Rata: "+nilaiRata);

        double beratBadan = 75.25;
        double tinggiBadan = 1.66;
        
        double nilaiBMI = beratBadan/(tinggiBadan*tinggiBadan);
        
        System.out.println("Nilai BMI: "+nilaiBMI);
    }
    
}
