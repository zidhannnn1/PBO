package ResponsiUTS;

public class Main {
    public static void main(String[] args) {
        Produk Laptop = new Elektronik("Laptop", 15000000, 2);
        Produk Snack = new Makanan("Snack", 15000, "2023-12-30");
        Pegawai Zidhan = new PegawaiTetap("Zidhan", 5000000, 1000000);
        Pegawai Andi = new PegawaiKontrak("Andi", 3000000, 12);

        // Menampilkan info produk
        System.out.println("Output Produk:");
        Laptop.tampilkanInfo();
        System.out.println();

        // Menampilkan info pegawai
        System.out.println("Output Pegawai:");
        Zidhan.tampilkanInfo();
        System.out.println();

        //Menampilkan Polimorfisme
        System.out.println("Polimorfisme :");
        Snack.tampilkanInfo();
        System.out.println();
        Andi.tampilkanInfo();
    }
}
