public class pertemuan4 {
    public static void main(String[] args){
        //logika perulangan dengan for
        System.out.println("Menghitung nilai mundur roket dengan for!");

        for(int i=10; i>=0; i--){
            if (i==5) {
                continue;
            }
            System.out.println(i);
        }

        System.out.println("Rocket Diluncurkan");

        //logika perulangan dengan while
        System.out.println("Menghitung nilai mundur roket dengan while!");
        int i =10;

        while (i>=0){
            System.out.println(i);
            i--;
            if (i==5) {
                break; // kondisi break
            }
        }
        System.out.println("Rocket Diluncurkan");

        //logika perulangan dengan do while
        System.out.println("Menghitung nilai mundur roket dengan do while!");
        i =10;
        do {
            System.out.println(i);
            i--;
        } while (i>=0);
        System.out.println("Rocket Diluncurkan");

    }
    
}
