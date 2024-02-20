/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Other/File.java to edit this template
 */

/**
 *
 * @author Khrisna Wahyu Wibisono
 */

import java.util.Scanner;

public class Soal_3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Masukkan karakter pertama: ");
        char charX = scanner.next().charAt(0);

        System.out.print("Masukkan karakter kedua: ");
        char charY = scanner.next().charAt(0);

        int asciiX = (int) charX;
        int asciiY = (int) charY;

        int sumAscii = asciiX + asciiY;

        System.out.println("ASCII code dari " + charX + ": " + asciiX);
        System.out.println("ASCII code dari " + charY + ": " + asciiY);
        System.out.println("Jumlah dari Code ASCII : " + sumAscii);

        scanner.close();
    }
}
