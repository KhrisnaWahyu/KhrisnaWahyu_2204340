import java.util.Scanner;

public class UTS_No3_Method {
    public static int reverse(int number) {
        int reversedNumber = 0;
        while (number != 0) {
            int digit = number % 10;
            reversedNumber = reversedNumber * 10 + digit;
            number /= 10;
        }
        return reversedNumber;
    }

    // Return true if number is a palindrome
    public static boolean isPalindrome(int number) {
        return number == reverse(number);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Enter an integer: ");
        int inputNumber = scanner.nextInt();

        if (isPalindrome(inputNumber)) {
            System.out.println(inputNumber + " is a palindrome.");
        } else {
            System.out.println(inputNumber + " is not a palindrome.");
        }
        scanner.close();
    }
}
