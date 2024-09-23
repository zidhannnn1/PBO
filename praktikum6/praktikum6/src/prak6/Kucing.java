package prak6;

import praktikum6.Hewan;

public class Kucing extends Hewan{
    @Override
    public void bersuara() {
        System.out.println("Meow");
    }
}
class Anjing extends Hewan{
    @Override
    public void bersuara(){
        System.out.println("Gok");
    }
}
