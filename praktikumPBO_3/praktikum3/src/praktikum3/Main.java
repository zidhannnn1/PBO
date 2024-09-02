package praktikum3;
public class Main {
    public static void main(String[] args) {
        //hewan kucing = new hewan("Mimi", 3);
        //kucing.suara();
        //kucing.info();

        //hewan anjing = new hewan("Rio", 3);
        //anjing.suara();
        //anjing.info();
       // anjing.berlari();

        Mobil mobil1 = new Mobil("Honda", "Civic", 2023, "Merah");
        mobil1.info();
        mobil1.startEngine();
        mobil1.setWarna("Putih");
        System.out.println();
        System.out.println("Mobil 1 setelah dirubah warna");
        mobil1.info();
    }
}
