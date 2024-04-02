public class Main {
    // Metode untuk melakukan pengurutan menggunakan Selection Sort
    public static void selectionSort(int[] arr) {
        int n = arr.length;

        for (int i = 0; i < n - 1; i++) {
            int minIndex = i;
            for (int j = i + 1; j < n; j++) {
                if (arr[j] < arr[minIndex]) {
                    minIndex = j;
                }
            }
            int temp = arr[minIndex];
            arr[minIndex] = arr[i];
            arr[i] = temp;
        }
    }

    public static void main(String[] args) {
        // Inisialisasi array dengan 100.000 angka acak
        int[] numbers = new int[100000];
        for (int i = 0; i < 100000; i++) {
            numbers[i] = (int) (Math.random() * 100000);
        }

        // Membuat objek StopWatch
        StopWatch stopwatch = new StopWatch();

        // Memulai stopwatch
        stopwatch.start();

        // Melakukan pengurutan menggunakan selection sort
        selectionSort(numbers);

        // Menghentikan stopwatch
        stopwatch.stop();

        // Menampilkan waktu yang telah berlalu untuk pengurutan
        System.out.println("Waktu yang dibutuhkan untuk pengurutan: " + stopwatch.getElapsedTime() + " milidetik");
    }
}