package tugas6;

public abstract class Produk {
    protected String nama;
    protected double harga;

    public Produk(String nama, double harga) {
        this.nama = nama;
        this.harga = harga;
    }

    public abstract double hitungDiskon();

    public double getHarga() {
        return harga;
    }

    public String getNama() {
        return nama;
    } 
}
