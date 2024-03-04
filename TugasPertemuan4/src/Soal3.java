import java.util.Scanner;

public class Soal3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Masukkan nilai N (antara 1 sampai 1000): ");
        int N = scanner.nextInt();
        
        if (N > 1 && N < 1000) {
            for (int i = N; i > 0 ; i--) {
                for (int j = 0; j < i; j++) {
                    System.out.print("* ");
                }
                System.out.println(); // Pindah baris setelah mencetak N bintang pada satu baris
            }
        }else{
            System.out.println("Nilai N harus antara 1 sampai 1000.");
            scanner.close();
            return;
        }
        
        scanner.close();
    }
}
