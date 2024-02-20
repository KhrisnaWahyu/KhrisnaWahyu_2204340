/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Other/File.java to edit this template
 */

/**
 *
 * @author Khrisna Wahyu Wibisono
 */

import java.util.Scanner;

public class Soal_2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Masukkan jumlah tabungan Anda (dalam rupiah): ");
        double tabungan = scanner.nextDouble();
        
        System.out.print("Apakah Anda sudah memiliki calon pasangan? (true/false): ");
        boolean calonPasangan = scanner.nextBoolean();
        
        String statusNikah = (tabungan > 100000000 && calonPasangan) ? "Selamat! Anda bisa menikah." : "Maaf, Anda belum bisa menikah.";
        
        System.out.println(statusNikah);
        
        scanner.close();
    }
}
