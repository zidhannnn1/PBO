abstract class Kendaraan {

    abstract void berjalan();
    void info(){
        System.out.println("ini adalah kendaraan");
    }
}

class Mobil extends Kendaraan{
    @Override
    void berjalan(){
        System.out.println("mobil sedang berjalan dengan cepat");
    }
}

class Sepeda extends Kendaraan{
    @Override
    void berjalan(){
        System.out.println("sepeda berjalan dengan pelan");
    }
}
