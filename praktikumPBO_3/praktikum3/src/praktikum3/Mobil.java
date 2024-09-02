package praktikum3;

public class Mobil {
    private String merk;
    private String model;
    private int tahun;
    private String warna;

    // Constructor
    public Mobil(String merk, String model, int tahun, String warna) {
        this.merk = merk;
        this.model = model;
        this.tahun = tahun;
        this.warna = warna;
    }

    // Getter for merk
    public String getMerk() {
        return merk;
    }

    // Setter for merk
    public void setMerk(String merk) {
        this.merk = merk;
    }

    // Getter for model
    public String getModel() {
        return model;
    }

    // Setter for model
    public void setModel(String model) {
        this.model = model;
    }

    // Getter for tahun
    public int getTahun() {
        return tahun;
    }

    // Setter for tahun
    public void setTahun(int tahun) {
        this.tahun = tahun;
    }

    // Getter for warna
    public String getWarna() {
        return warna;
    }

    // Setter for warna
    public void setWarna(String warna) {
        this.warna = warna;
    }

    // Method to display car's information
    void info() {
        System.out.println("Merk: " + merk);
        System.out.println("Model: " + model);
        System.out.println("Tahun: " + tahun);
        System.out.println("Warna: " + warna);
    }

    // Method to start the engine
    void startEngine() {
        System.out.println("Mesin mobil " + merk + " menyala");
    }
}
