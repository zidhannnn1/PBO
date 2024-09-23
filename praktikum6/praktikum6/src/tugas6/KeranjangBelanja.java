package tugas6;

import java.util.ArrayList;
import java.util.List;

public class KeranjangBelanja {
    private List<Produk> produkList;

    public KeranjangBelanja() {
        produkList = new ArrayList<>();
    }

    public void tambahProduk(Produk produk) {
        produkList.add(produk);
    }

    public double totalHargaSetelahDiskon() {
        double total = 0;
        for (Produk produk : produkList) {
            total += (produk.getHarga() - produk.hitungDiskon());
        }
        return total;
    }
}
