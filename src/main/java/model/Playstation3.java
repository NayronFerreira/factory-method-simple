package model;

public class Playstation3 extends Playstation {
    @Override
    public void getHardware() {
        System.out.println("Lista de Hardware");
        System.out.println("\t- 1 console Full");
        System.out.println("\t- 2 wirelles controls");
        System.out.println("\t- 10Gb memory");
        System.out.println("\t- 2Gb RAM");
    }
}
