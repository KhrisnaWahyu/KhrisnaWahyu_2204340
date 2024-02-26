import java.util.Scanner;

public class Soal2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Masukkan nilai UTS: ");
        int uts = input.nextInt();

        System.out.print("Masukkan nilai UAS: ");
        int uas = input.nextInt();

        System.out.print("Masukkan nilai Tugas: ");
        int tugas = input.nextInt();

        // Menghitung nilai akhir (NA) dengan bobot masing-masing komponen nilai
        double nilaiAkhir = (uts * 0.35) + (uas * 0.45) + (tugas * 0.20);

        if (nilaiAkhir >= 80 && nilaiAkhir <= 100) {
            System.out.println("Nilai Akhir (NA): " + nilaiAkhir);
            System.out.println("Indeks Akhir: A");
        } else if (nilaiAkhir >= 70 && nilaiAkhir <= 80) {
            System.out.println("Nilai Akhir (NA): " + nilaiAkhir);
            System.out.println("Indeks Akhir: B");
        } else if (nilaiAkhir >= 50 && nilaiAkhir <= 70) {
            System.out.println("Nilai Akhir (NA): " + nilaiAkhir);
            System.out.println("Indeks Akhir: C");
        }else{
            System.out.println("Nilai Akhir (NA): " + nilaiAkhir);
            System.out.println("Indeks Akhir: D");
        }

        input.close();
    }
}
