package Tugas10;

public class Main {
    public static void main(String[] args) {
        Pembayaran produkElektronik = new Elektronik();
        Pembayaran produkMakanan = new Makanan();
     
        System.out.println("Pajak Elektronik: Rp" + produkElektronik.hitungPajak(1000000));
        System.out.println("Pajak Makanan: Rp" + produkMakanan.hitungPajak(50000));
    }
}
