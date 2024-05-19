public class Segitiga extends ObjekGeometris {
    private double side1;
    private double side2;
    private double side3;

    // Konstruktor tanpa argumen
    public Segitiga() {
        this(1.0, 1.0, 1.0);
    }

    // Konstruktor dengan argumen
    public Segitiga(double side1, double side2, double side3) {
        this.side1 = side1;
        this.side2 = side2;
        this.side3 = side3;
    }

    // Metode akses untuk side1
    public double getSide1() {
        return side1;
    }

    // Metode akses untuk side2
    public double getSide2() {
        return side2;
    }

    // Metode akses untuk side3
    public double getSide3() {
        return side3;
    }

    // Metode untuk menghitung luas
    public double getArea() {
        double s = (side1 + side2 + side3) / 2;
        double luas = Math.sqrt(s * (s - side1) * (s - side2) * (s - side3));
        
        return luas;
    }

    // Metode untuk menghitung keliling
    public double getPerimeter() {
        return side1 + side2 + side3;
    }

    // Metode toString untuk memberikan deskripsi
    @Override
    public String toString() {
        return "Segitiga: sisi1 = " + side1 + " sisi2 = " + side2 + " sisi3 = " + side3;
    }
}
