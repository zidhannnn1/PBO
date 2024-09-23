package tugas5;

// Kelas Induk Hewan
class Hewan { 
  String nama; 
  String jenis; 

  public void tampilkanInfo() { 
      System.out.println("Nama Hewan: " + nama); 
      System.out.println("Jenis: " + jenis); 
  } 
} 

// Kelas Turunan HewanAir
class HewanAir extends Hewan {
  String habitatAir;
  
  @Override
  public void tampilkanInfo() {
    super.tampilkanInfo();
    System.out.println("Habitat: " + habitatAir);
  }
}

// Kelas Turunan HewanDarat
class HewanDarat extends Hewan {
  String habitatDarat;
  
  @Override
  public void tampilkanInfo() {
    super.tampilkanInfo();
    System.out.println("Habitat: " + habitatDarat);
  }
}

// Kelas Turunan Kucing 
class Kucing extends HewanDarat { 
  String suara; 

  @Override 
  public void tampilkanInfo() { 
      super.tampilkanInfo(); 
      System.out.println("Dia bersuara MIAW"); 
  }  
}

// Kelas Turunan Anjing
class Ikan extends HewanAir { 
  String suara; 

  @Override 
  public void tampilkanInfo() { 
      super.tampilkanInfo(); 
      System.out.println("Dia bersuara Blubub blubub"); 
  } 
} 

// Main class
public class Main {
  public static void main(String[] args) {
    Kucing kucing = new Kucing();
    kucing.nama = "Oyen";
    kucing.jenis = "Mamalia";
    kucing.habitatDarat = "Darat";
    kucing.tampilkanInfo();
    
    Ikan ikan = new Ikan();
    ikan.nama = "Nemo";
    ikan.jenis = "Ikan Badut";
    ikan.habitatAir = "Air";
    ikan.tampilkanInfo();
  }
}
