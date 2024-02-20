/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Other/File.java to edit this template
 */

/**
 *
 * @author Khrisna Wahyu Wibisono
 */
import java.util.Scanner;

public class Soal_1 {

    public static void main(String args[]) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Masukan Nilai Pecahan Pertama dengan Format (a/b): ");
        String input1 = scanner.nextLine();
        System.out.println("Masukan Nilai Pecahan Kedua dengan Format (a/b): ");
        String input2 = scanner.nextLine();
        System.out.println("Masukan Nilai Pecahan Ketiga dengan Format (a/b): ");
        String input3 = scanner.nextLine();
        
        String[] Pecahan1 = input1.split("/");
        String[] Pecahan2 = input2.split("/");
        String[] Pecahan3 = input3.split("/");
        
        //Mengubah String menjadi Integer
        int a = Integer.parseInt(Pecahan1[0]);
        int b = Integer.parseInt(Pecahan1[1]);
        int c = Integer.parseInt(Pecahan2[0]);
        int d = Integer.parseInt(Pecahan2[1]);
        int e = Integer.parseInt(Pecahan3[0]);
        int f = Integer.parseInt(Pecahan3[1]);
        
        //Operasi Aritmatika
        int Jumlah = a * d * f + c * b * f + e * b * d;
        int hasilPecahan = b * d * f;
        
        //Output
        System.out.println("Hasil penjumlahan: " + Jumlah + "/" + hasilPecahan);
        System.out.println("Hasil pengurangan: " + (Jumlah - hasilPecahan) + "/" + hasilPecahan);
        System.out.println("Hasil perkalian: " + (a * c * e) + "/" + (b * d * f));
        System.out.println("Hasil pembagian: " + (a * d * f) + "/" + (c * b * e));
    }
}
