import java.util.Scanner;

public class UTS_No2_Pattern {
    static void Pattern_A() {
        for (int i = 1; i <= 6; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(j + " ");
            }
            System.out.println();
        }
    }

    static void Pattern_B() {
        for (int i = 6; i >= 1; i--) {
            for (int j = 1; j <= i; j++) {
                System.out.print(j + " ");
            }
            System.out.println();
        }
    }

    static void Pattern_C() {
        for (int i = 1; i <= 6; i++) {
            for (int k = 1; k <= 6 - i; k++) {
                System.out.print("  ");
            }
            for (int j = i; j >= 1; j--) {
                System.out.print(j + " ");
            }
            System.out.println();
        }
    }

    static void Pattern_D() {
        for (int i = 6; i >= 1; i--) {
            for (int k = 1; k <= 6 - i; k++) {
                System.out.print("  ");
            }
            for (int j = 1; j <= i; j++) {
                System.out.print(j + " ");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        int Pilihan;
        Scanner scanner = new Scanner(System.in);
        do {

            System.out.print("Masukan Pilhan Pattern: ");
            Pilihan = scanner.nextInt();

            switch (Pilihan) {
                case 1:
                    Pattern_A();
                    break;

                case 2:
                    Pattern_B();
                    break;

                case 3:
                    Pattern_C();
                    break;

                case 4:
                    Pattern_D();
                    break;

                case 0:
                    Pilihan = 0;
                    break;

                default:
                    System.out.println("Inputan Salah. Pilihan Input Hanya '1', '2', '3', '4', or '0'.");
                    break;
            }
        } while (Pilihan != 0);

    }
}
