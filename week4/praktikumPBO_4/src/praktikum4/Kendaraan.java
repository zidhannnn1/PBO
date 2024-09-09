package praktikum4;

public class Kendaraan {
    private String nama;
    protected int kecepatanMax;
    public String jenisMesin;

    // Constructor
    public Kendaraan(String nama, int kecepatanMax, String jenisMesin) {
        this.nama = nama;
        this.kecepatanMax = kecepatanMax;
        this.jenisMesin = jenisMesin;
    }

    // Getter for merk
    public String getNama() {
        return nama;
    }

    // Setter for merk
    public void setNama(String nama) {
        this.nama = nama;
    }

    public void tampilkanInfoKendaraan(){
        System.out.println("Nama Kendaraan :"+ nama);
        System.out.println("Kecepatan Max :"+ kecepatanMax + "km/h");
        System.out.println("Jenis Mesin :"+ jenisMesin);
    }
}