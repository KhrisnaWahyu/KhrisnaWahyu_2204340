public class UTS_No4_Main {
    public static void main(String[] args) {
        UTS_No4_Balok Balok1 = new UTS_No4_Balok();
        System.out.println("Balok dengan panjang : " + Balok1.Panjang + ", lebar : " + Balok1.Lebar + " dan tinggi : "
                + Balok1.Tinggi + ". Luasnya : " + Balok1.getLuas() + ", sedangkan kelilingnya : "
                + Balok1.getKeliling() + " dan volumenya : " + Balok1.getVolume());

        UTS_No4_Balok Balok2 = new UTS_No4_Balok(30, 40, 50);
        System.out.println("\nBalok dengan panjang : " + Balok2.Panjang + ", lebar : " + Balok2.Lebar + " dan tinggi : "
                + Balok2.Tinggi + ". Luasnya : " + Balok2.getLuas() + ", sedangkan kelilingnya : "
                + Balok2.getKeliling() + " dan volumenya : " + Balok2.getVolume());

        UTS_No4_Balok Balok3 = new UTS_No4_Balok(25, 35, 45);
        System.out.println("\nBalok dengan panjang : " + Balok3.Panjang + ", lebar : " + Balok3.Lebar + " dan tinggi : "
                + Balok3.Tinggi + ". Luasnya : " + Balok3.getLuas() + ", sedangkan kelilingnya : "
                + Balok3.getKeliling() + " dan volumenya : " + Balok3.getVolume());
    }
}
