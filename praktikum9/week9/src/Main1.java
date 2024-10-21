public class Main1 {
    public static void main(String[] args) {
        Hewan kucing = new Kucing();
        Hewan anjing = new Anjing();
        
        tampilkanSuara(kucing); 
        tampilkanSuara(anjing);   
    }
    
    static void tampilkanSuara(Hewan hewan) {
        System.out.println(hewan.getClass().getSimpleName() + " mengeluarkan suara: " + hewan.suara());
    }
}
