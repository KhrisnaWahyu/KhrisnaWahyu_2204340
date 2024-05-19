public class ObjekGeometris {
    private String warna = "putih";
    private boolean terisi;

    // Konstruktor default
    public ObjekGeometris() {
    }

    // Konstruktor dengan parameter
    public ObjekGeometris(String warna, boolean terisi) {
        this.warna = warna;
        this.terisi = terisi;
    }

    // Metode akses untuk warna
    public String getWarna() {
        return warna;
    }

    public void setWarna(String warna) {
        this.warna = warna;
    }

    // Metode akses untuk properti terisi
    public boolean isTerisi() {
        return terisi;
    }

    public void setTerisi(boolean terisi) {
        this.terisi = terisi;
    }

    // Metode toString untuk memberikan deskripsi
    @Override
    public String toString() {
        return "ObjekGeometris [warna=" + warna + ", terisi=" + terisi + "]";
    }
}