package model;

public class Playstation5 extends Playstation {
    @Override
    public void getHardware() {
        System.out.println("Lista de Hardware");
        System.out.println("\t- 1 console Slim");
        System.out.println("\t- 2 controllers wirelles 3.0");
        System.out.println("\t- 1Tb memory");
        System.out.println("\t- 10Gb RAM");
    }
}
