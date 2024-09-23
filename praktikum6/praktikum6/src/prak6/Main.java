package prak6;

import praktikum6.Hewan;

public class Main {
    public static void main(String[] args) {
        Hewan hewan = new Kucing();
        hewan.bersuara();

        Kucing kucing = new Kucing();
        kucing.makan("ikan");
        kucing.makan("ikan", 2);

        Anjing anjing = new Anjing();
        anjing.bersuara();
        anjing.makan("daging", 4);
    }
}
