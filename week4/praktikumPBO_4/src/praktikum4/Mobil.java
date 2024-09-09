package praktikum4;

public class Mobil extends Kendaraan {
    private int jumlahPintu;

    public Mobil(String nama, int kecepatanMax, String jenisMesin, int jumlahPintu){
        super(nama, kecepatanMax, jenisMesin);
        this.jumlahPintu = jumlahPintu;
    }
    public void tampilkanInfoMobil(){
        System.out.println("Kecepatan Max Mobil :"+ kecepatanMax +"km/h");
        System.out.println("Jumlah Pintu :"+ jumlahPintu);
    }
}
