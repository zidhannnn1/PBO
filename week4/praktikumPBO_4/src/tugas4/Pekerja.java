package tugas4;

public class Pekerja extends Manusia{
    private double gaji;

    // Constructor
    public Pekerja(String nama, int usia, String pekerjaan, double gaji) {
        super(nama, usia, pekerjaan);
        this.gaji = gaji;
    }

    // Getter untuk gaji
    public double getGaji() {
        return gaji;
    }

    // Setter untuk gaji
    public void setGaji(double gaji) {
        this.gaji = gaji;
    }

    // Override metode toString()
    @Override
    public String toString() {
        return "Nama: " + getNama() + ", Usia: " + getUsia() + ", Pekerjaan: " + pekerjaan + ", Gaji: " + gaji;
    }
}
