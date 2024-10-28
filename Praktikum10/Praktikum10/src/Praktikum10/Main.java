package Praktikum10;
public class Main {
    public static void main(String[] args) {
        OperasiHitung penjumlahan = new Penjumlahan();
        System.out.println("Penjumlahan : " + penjumlahan.hitung(10, 5));

        OperasiHitung pengurangan = new Pengurangan();
        System.out.println("Pengurangan : " + pengurangan.hitung(10, 5));
    }
}