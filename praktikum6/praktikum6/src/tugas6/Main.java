package tugas6;

public class Main {
    public static void main(String[] args) {
        KeranjangBelanja keranjang = new KeranjangBelanja();

        Produk buku = new Buku("Java Programming", 100.0);
        Produk elektronik = new Elektronik("Smartphone", 200.0);
        Produk pakaian = new Pakaian("T-Shirt", 50.0);

        keranjang.tambahProduk(buku);
        keranjang.tambahProduk(elektronik);
        keranjang.tambahProduk(pakaian);

        double total = keranjang.totalHargaSetelahDiskon();
        System.out.println("Total harga setelah diskon: " + total);
    }
}
