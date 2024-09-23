package praktikum6;

/**
 * Hewan
 */
public class Hewan {

    public void bersuara () {
        System.out.println("Hewan bersuara");
    }

    public void makan(String makanan) {
        System.out.println("Hewan makan "+ makanan);
    }

    public void makan(String makanan, int jumlah){
        System.out.println("Hewan makan "+ jumlah + "porsi "+ makanan);
    }
}