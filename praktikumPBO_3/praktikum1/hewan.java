public class hewan {
    private String nama;
    private int umur;

    public hewan(String nama, int umur){
        this.nama = nama;
        this.umur = umur;
    }
    public String getNama(){
        return nama;
    }
    public void setNama(String nama){
        this.nama = nama;
    }
    public int getUmur(){
        return umur;
    }
    public void setUmur(int umur){
        this.umur = umur;
    }
    void suara(){
        System.out.println("Hewan Bersuara");
    }
    void info() {
        System.System.out.println("Nama :" + getNama() + "Umur :" + getUmur());
    }
}