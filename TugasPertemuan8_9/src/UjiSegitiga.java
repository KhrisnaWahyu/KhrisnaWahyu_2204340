import java.util.Scanner;

public class UjiSegitiga {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Meminta pengguna untuk memasukkan tiga sisi segitiga
        System.out.print("Masukkan sisi1: ");
        double side1 = input.nextDouble();
        System.out.print("Masukkan sisi2: ");
        double side2 = input.nextDouble();
        System.out.print("Masukkan sisi3: ");
        double side3 = input.nextDouble();

        // Meminta pengguna untuk memasukkan warna
        System.out.print("Masukkan warna: ");
        String warna = input.next();

        // Meminta pengguna untuk memasukkan nilai boolean untuk menunjukkan apakah
        // segitiga terisi
        System.out.print("Apakah segitiga terisi (true/false)? ");
        boolean terisi = input.nextBoolean();

        // Membuat objek Segitiga dengan sisi-sisi yang ditentukan
        Segitiga segitiga = new Segitiga(side1, side2, side3);
        segitiga.setWarna(warna);
        segitiga.setTerisi(terisi);

        // Menampilkan luas, keliling, warna, dan nilai boolean untuk menunjukkan apakah
        // segitiga terisi
        System.out.println("\nSegitiga:\n" + segitiga.toString());
        System.out.println("Luas: " + segitiga.getArea());
        System.out.println("Keliling: " + segitiga.getPerimeter());
        System.out.println("Warna: " + segitiga.getWarna());
        System.out.println("Terisi: " + segitiga.isTerisi());

        input.close();
    }
}
