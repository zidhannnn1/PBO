package tugas4;

public class Manusia {
    private String nama;
    protected int usia;
    public String pekerjaan;

    // Constructor
    public Manusia(String nama, int usia, String pekerjaan) {
        this.nama = nama;
        this.usia = usia;
        this.pekerjaan = pekerjaan;
    }

    // Getter untuk nama
    public String getNama() {
        return nama;
    }

    // Setter untuk nama
    public void setNama(String nama) {
        this.nama = nama;
    }
    
    // Getter untuk usia
    public int getUsia() {
        return usia;
    }

    // Setter untuk usia
    public void setUsia(int usia) {
        this.usia = usia;
    }
    
    // Getter untuk pekerjaan
    public String getPekerjaan() {
        return pekerjaan;
    }

    // Setter untuk pekerjaan
    public void setPekerjaan(String pekerjaan) {
        this.pekerjaan = pekerjaan;
    }
}
