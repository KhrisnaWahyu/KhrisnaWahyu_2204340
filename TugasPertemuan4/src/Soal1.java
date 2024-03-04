import java.util.Scanner;

public class Soal1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // Meminta masukan tiga integer
        System.out.println("Masukkan tiga angka integer: ");
        int[] numbers = new int[3];
        for (int i = 0; i < 3; i++) {
            numbers[i] = scanner.nextInt();
        }
        
        // Memeriksa apakah semua angka tersebut merupakan angka ribuan
        boolean allRibuan = true;
        for (int num : numbers) {
            if (!isRibuan(num)) {
                allRibuan = false;
                break;
            }
        }
        
        if (allRibuan) {
            System.out.println("Semua angka adalah angka ribuan.");
        } else {
            System.out.println("Tidak semua angka adalah angka ribuan.");
        }
        
        scanner.close();
    }
    
    // Method untuk memeriksa apakah sebuah angka merupakan angka ribuan
    public static boolean isRibuan(int num) {
        return num >= 1000 && num <= 9999;
    }
}

