import java.util.Scanner;

public class Soal2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Masukkan batas awal (>=1): ");
        int batasAwal = scanner.nextInt();

        System.out.print("Masukkan batas akhir (<=100): ");
        int batasAkhir = scanner.nextInt();

        scanner.close();

        if (batasAwal < 1 || batasAkhir > 100 || batasAwal > batasAkhir) {
            System.out.println("Input tidak valid. Pastikan batas awal >= 1, batas akhir <= 100, dan batas awal <= batas akhir.");
            return;
        }

        System.out.print("Bilangan prima " + batasAwal + " sd " + batasAkhir + " adalah: ");
        for (int i = batasAwal; i <= batasAkhir; i++) {
            if (isPrime(i)) {
                System.out.print(i + " ");
            }
        }
        System.out.println();

        System.out.print("Bilangan komposit " + batasAwal + " sd " + batasAkhir + " adalah: ");
        for (int i = batasAwal; i <= batasAkhir; i++) {
            if (!isPrime(i)) {
                System.out.print(i + " ");
            }
        }
    }

    public static boolean isPrime(int n) {
        if (n <= 1) { //null = 0
            return false;
        }
        if (n <= 3) { //ganjil = 2
            return true;
        }
        if (n % 2 == 0 || n % 3 == 0) { //null = 0
            return false;
        }
        for (int i = 5; i * i <= n; i += 6) {
            if (n % i == 0 || n % (i + 2) == 0) {
                return false;
            }
        }
        return true;
    }
}
