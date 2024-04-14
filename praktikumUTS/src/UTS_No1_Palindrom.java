import java.util.Scanner;

public class UTS_No1_Palindrom {
    // Fungsi untuk memeriksa apakah sebuah bilangan palindrom
    public static boolean isPalindrome(int number) {
        int Bilangan_Asli = number;
        int Bilangan_Reversed = 0;
        while (number != 0) {
            int digit = number % 10;
            Bilangan_Reversed = Bilangan_Reversed * 10 + digit;
            number /= 10;
        }
        // Memeriksa apakah bilangan asli sama dengan bilangan terbalik
        return Bilangan_Asli == Bilangan_Reversed;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Masukkan bilangan tiga digit Integer: ");
        int number = scanner.nextInt();

        if (isPalindrome(number)) {
            System.out.println(number + " adalah bilangan palindrom.");
        } else {
            System.out.println(number + " bukan bilangan palindrom.");
        }

        scanner.close();
    }

}
