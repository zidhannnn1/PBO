// Kelas Abstrak Hewan
abstract class Hewan {
    abstract String suara();
}

// Kelas Kucing yang merupakan turunan dari Hewan
class Kucing extends Hewan {
    @Override
    String suara() {
        return "Meong";
    }
}
class Anjing extends Hewan {
    @Override
    String suara() {
        return "Guk Guk";
    }
}

