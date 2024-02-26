import java.util.Scanner;

public class Soal1 {

    public static void main(String[] args){
        Scanner input = new Scanner(System.in);

        System.out.print("Masukkan Bilangan Pertama: ");
        int bilangan1 = input.nextInt();

        System.out.print("Masukkan Bilangan Kedua: ");
        int bilangan2 = input.nextInt();

        if (bilangan1 % 2 == 0 && bilangan2 % 2 == 0) {
            int hasil = bilangan1 + bilangan2;
            System.out.println("Hasil Penjumlahan: " + hasil);
        } else {
            int hasil = bilangan1 * bilangan2;
            System.out.println("Hasil Perkalian: " + hasil);
        }

        input.close();
    }
}
