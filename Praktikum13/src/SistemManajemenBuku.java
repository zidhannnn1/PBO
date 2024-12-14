import java.io.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

// Kelas Buku
class Buku implements Serializable {
    private String judul;
    private String pengarang;
    private int tahunTerbit;

    public Buku(String judul, String pengarang, int tahunTerbit) {
        this.judul = judul;
        this.pengarang = pengarang;
        this.tahunTerbit = tahunTerbit;
    }

    @Override
    public String toString() {
        return "Judul: " + judul + ", Pengarang: " + pengarang + ", Tahun Terbit: " + tahunTerbit;
    }

    public String toFileString() {
        return judul + "," + pengarang + "," + tahunTerbit;
    }

    public static Buku fromFileString(String fileString) {
        String[] data = fileString.split(",");
        return new Buku(data[0], data[1], Integer.parseInt(data[2]));
    }
}

public class SistemManajemenBuku {
    private static final String FILE_TEXT = "buku.txt";
    private static final String FILE_SERIAL = "buku.ser";

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        boolean running = true;

        while (running) {
            System.out.println("\nMenu:");
            System.out.println("1. Tambah Buku Baru dan Simpan ke File teks");
            System.out.println("2. Simpan Objek Buku ke File Serialisasi");
            System.out.println("3. Tampilkan Daftar Buku dari File teks dan File Serialisasi");
            System.out.println("4. Keluar");
            System.out.print("Pilih menu: ");
            int pilihan = scanner.nextInt();
            scanner.nextLine(); // Membaca newline

            switch (pilihan) {
                case 1:
                    tambahBuku(scanner);
                    break;
                case 2:
                    simpanSerialisasi();
                    break;
                case 3:
                    tampilkanDaftarBuku();
                    break;
                case 4:
                    running = false;
                    break;
                default:
                    System.out.println("Pilihan tidak valid. Coba lagi.");
                    break;
            }
        }

        scanner.close();
    }

    private static void tambahBuku(Scanner scanner) {
        System.out.print("Masukkan judul buku: ");
        String judul = scanner.nextLine();
        System.out.print("Masukkan pengarang buku: ");
        String pengarang = scanner.nextLine();
        System.out.print("Masukkan tahun terbit: ");
        int tahunTerbit = scanner.nextInt();
        scanner.nextLine(); // Membaca newline

        Buku buku = new Buku(judul, pengarang, tahunTerbit);

        try (BufferedWriter writer = new BufferedWriter(new FileWriter(FILE_TEXT, true))) {
            writer.write(buku.toFileString());
            writer.newLine();
            System.out.println("Buku berhasil disimpan ke " + FILE_TEXT);
        } catch (IOException e) {
            System.out.println("Gagal menyimpan buku: " + e.getMessage());
        }
    }

    private static void simpanSerialisasi() {
        List<Buku> bukuList = new ArrayList<>();

        // Membaca dari buku.txt
        try (BufferedReader reader = new BufferedReader(new FileReader(FILE_TEXT))) {
            String line;
            while ((line = reader.readLine()) != null) {
                bukuList.add(Buku.fromFileString(line));
            }
        } catch (IOException e) {
            System.out.println("Gagal membaca file teks: " + e.getMessage());
        }

        // Menyimpan ke buku.ser
        try (ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(FILE_SERIAL))) {
            oos.writeObject(bukuList);
            System.out.println("Buku berhasil diserialisasi ke " + FILE_SERIAL);
        } catch (IOException e) {
            System.out.println("Gagal serialisasi: " + e.getMessage());
        }
    }

    @SuppressWarnings("unchecked")
    private static void tampilkanDaftarBuku() {
        System.out.println("\nDaftar Buku dari File Teks:");
        try (BufferedReader reader = new BufferedReader(new FileReader(FILE_TEXT))) {
            String line;
            while ((line = reader.readLine()) != null) {
                System.out.println(Buku.fromFileString(line));
            }
        } catch (IOException e) {
            System.out.println("Gagal membaca file teks: " + e.getMessage());
        }

        System.out.println("\nDaftar Buku dari File Serialisasi:");
        try (ObjectInputStream ois = new ObjectInputStream(new FileInputStream(FILE_SERIAL))) {
            List<Buku> bukuList = (List<Buku>) ois.readObject();
            for (Buku buku : bukuList) {
                System.out.println(buku);
            }
        } catch (IOException | ClassNotFoundException e) {
            System.out.println("Gagal membaca file serialisasi: " + e.getMessage());
        }
    }
}
