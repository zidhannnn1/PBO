package praktikum11;

import java.util.ArrayList;
import java.util.List;

class Pengarang {
    private String namaPengarang;

    public Pengarang(String namaPengarang) {
        this.namaPengarang = namaPengarang;
    }

    public String infoPengarang() {
        return "Nama Pengarang: " + namaPengarang;
    }
}

class Buku {
    private String judul;
    private Pengarang pengarang; // Agregasi

    public Buku(String judul, Pengarang pengarang) {
        this.judul = judul;
        this.pengarang = pengarang;
    }

    public void infoBuku() {
        System.out.println("Judul Buku: " + judul + ", " + pengarang.infoPengarang());
    }
}

class Perpustakaan {
    private List<Buku> daftarBuku; // Komposisi

    public Perpustakaan() {
        this.daftarBuku = new ArrayList<>();
    }

    public void tambahBuku(Buku buku) {
        daftarBuku.add(buku);
    }

    public void infoPerpustakaan() {
        if (daftarBuku.isEmpty()) {
            System.out.println("Perpustakaan tidak memiliki buku.");
        } else {
            System.out.println("Daftar Buku di Perpustakaan:");
            for (Buku buku : daftarBuku) {
                buku.infoBuku();
            }
        }
    }

    public void hapusPerpustakaan() {
        System.out.println("Perpustakaan dan semua buku di dalamnya telah dihapus.");
        daftarBuku.clear();
    }
}

public class Main {
    public static void main(String[] args) {
        Pengarang pengarang1 = new Pengarang("Tere Liye");
        Pengarang pengarang2 = new Pengarang("Andrea Hirata");

        Buku buku1 = new Buku("Bumi", pengarang1);
        Buku buku2 = new Buku("Laskar Pelangi", pengarang2);

        Perpustakaan perpustakaan = new Perpustakaan();

        perpustakaan.tambahBuku(buku1);
        perpustakaan.tambahBuku(buku2);


        perpustakaan.infoPerpustakaan();

        perpustakaan.hapusPerpustakaan();
    }
}
