public class PersegiPanjang {

    int Panjang;
    int Lebar;

    PersegiPanjang(){
        Panjang = 1;
        Lebar = 1;
    }

    PersegiPanjang(int panjangBaru, int lebarBaru){
        Panjang = panjangBaru;
        Lebar = lebarBaru;
    }

    int getLuas(){
        return Panjang * Lebar;
    }

    int getKeliling(){
        return (2 * Panjang) + (2 * Lebar);
    }

    void setPanjang(int panjangBaru){
        Panjang = panjangBaru;
    }

    void setLebar(int lebarBaru){
        Lebar = lebarBaru;
    }
}
