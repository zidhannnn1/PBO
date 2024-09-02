package praktikum3;
public class Main {
    public static void main(String[] args) {
        hewan kucing = new hewan("Mimi", 3);
        kucing.suara();
        kucing.info();

        hewan anjing = new hewan("Rio", 3);
        anjing.suara();
        anjing.info();
        anjing.berlari();
    }
}
