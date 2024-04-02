class StopWatch {
    private long startTime;
    private long endTime;

    // Konstruktor tanpa argumen
    public StopWatch() {
        startTime = System.currentTimeMillis();
    }

    // Metode yang me reset startTime ke waktu saat ini.
    public long getStartTime() {
        return startTime;
    }

    // Metode yang menyetel endTime ke waktu saat ini.
    public long getEndTime() {
        return endTime;
    }

    // Metode untuk memulai stopwatch
    public void start() {
        startTime = System.currentTimeMillis();
    }

    // Metode untuk menghentikan stopwatch
    public void stop() {
        endTime = System.currentTimeMillis();
    }

    // Metode untuk mengembalikan waktu yang telah berlalu dalam milidetik
    public long getElapsedTime() {
        return endTime - startTime;
    }
}


