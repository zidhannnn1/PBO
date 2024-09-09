package tugas4;

public class Main {
    public static void main(String[] args) {
        // Membuat objek dari kelas Pekerja
        Pekerja pekerja = new Pekerja("Rio", 80, "Programmer", 9999999);

        // Menampilkan informasi pekerja
        System.out.println(pekerja.toString());

        // Mengubah nama pekerja
        pekerja.setNama("Zidhan");
        pekerja.setUsia(19);
        pekerja.setGaji(111111111);

        // Menampilkan ulang informasi pekerja
        System.out.println(pekerja.toString());

        // Mencoba akses langsung atribut nama, usia, dan gaji
        // Ini akan menyebabkan kesalahan kompilasi karena akses ke atribut di luar kelas atau subclass dibatasi oleh akses modifier-nya.
        // System.out.println(pekerja.nama); // Error: nama memiliki akses private
        // System.out.println(pekerja.usia); // Error: usia memiliki akses protected dan tidak dapat diakses di luar paket jika tidak menggunakan inheritance
        // System.out.println(pekerja.gaji); // Error: gaji memiliki akses private
    }
}
