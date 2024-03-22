public class Pertemuan6 {
    public static void main(String[] args) {
        PersegiPanjang PersegiPanjang1 = new PersegiPanjang();
        System.out.println("Persegi Panjang 1:");
        System.out.println("Panjang: " + PersegiPanjang1.Panjang + " Lebar: " + PersegiPanjang1.Lebar );
        System.out.println("Luas: " + PersegiPanjang1.getLuas());
        System.out.println("Keliling: " + PersegiPanjang1.getKeliling());

        PersegiPanjang PersegiPanjang2 = new PersegiPanjang(30,40);
        System.out.println("\nPersegi Panjang 2:");
        System.out.println("Panjang: " + PersegiPanjang2.Panjang + " Lebar: " + PersegiPanjang2.Lebar);
        System.out.println("Luas: " + PersegiPanjang2.getLuas());
        System.out.println("Keliling: " + PersegiPanjang2.getKeliling());

        PersegiPanjang2.setPanjang(25);
        PersegiPanjang2.setLebar(35);

        System.out.println("\nUpdated Persegi Panjang 2:");
        System.out.println("Panjang: " + PersegiPanjang2.Panjang + " Lebar: " + PersegiPanjang2.Lebar);
        System.out.println("Luas: " + PersegiPanjang2.getLuas());
        System.out.println("Keliling: " + PersegiPanjang2.getKeliling());
    }
}
