import java.util.Scanner;

public class Soal1a {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        int[] numbers = new int[3];
        for (int i = 0; i < 3; i++) {
            System.out.println("Masukkan bilangan integer ke " + (i + 1));
            numbers[i] = scanner.nextInt();
        }
        
        scanner.close();

        System.out.println("Angka yang merupakan ribuan:");
        for (int num : numbers) {
            if (isRibuan(num)) {
                System.out.println(num);
            }
        }
    }

    public static boolean isRibuan(int num) {
        return num >= 1000 && num <= 9999;
    }
}
