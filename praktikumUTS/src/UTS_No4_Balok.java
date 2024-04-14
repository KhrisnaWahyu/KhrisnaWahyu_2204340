public class UTS_No4_Balok {

    int Panjang;
    int Lebar;
    int Tinggi;

    UTS_No4_Balok() {
        Panjang = 1;
        Lebar = 1;
        Tinggi = 1;
    }

    UTS_No4_Balok(int panjangBaru, int lebarBaru, int tinggiBaru) {
        Panjang = panjangBaru;
        Lebar = lebarBaru;
        Tinggi = tinggiBaru;
    }

    int getLuas() {
        return 2 * ((Panjang * Lebar) + (Panjang * Tinggi) + (Lebar * Tinggi));
    }

    int getKeliling() {
        return 4 * (Panjang + Lebar + Tinggi);
    }

    int getVolume() {
        return Panjang * Lebar * Tinggi;
    }

    void setPanjang(int panjangBaru) {
        Panjang = panjangBaru;
    }

    void setLebar(int lebarBaru) {
        Lebar = lebarBaru;
    }

    void setTinggi(int tinggiBaru) {
        Tinggi = tinggiBaru;
    }
}
