import java.util.Scanner;

public class Soal3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Masukkan jumlah peserta: ");
        int jumlahPeserta = scanner.nextInt();

        int kapasitasMobil = 7;
        int jumlahMobil = KalkulatorMobil(jumlahPeserta, kapasitasMobil);

        System.out.println("Jumlah mobil yang diperlukan: " + jumlahMobil);

        scanner.close();
    }

    public static int KalkulatorMobil(int jumlahPeserta, int kapasitasMobil){
        if (jumlahPeserta <= kapasitasMobil) {
            return 1;
        }else{
            int jumlahMobil = jumlahPeserta / kapasitasMobil;
            if (jumlahPeserta % kapasitasMobil != 0) {
                jumlahMobil++;
            }
            return jumlahMobil;
        }
    }
}
