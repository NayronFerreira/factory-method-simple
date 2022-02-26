package model;

public class Playstation4 extends Playstation {
    @Override
    public void getHardware() {
        System.out.println("Lista de Hardware");
        System.out.println("\t- 1 console Slim");
        System.out.println("\t- 2 controllers wirelles");
        System.out.println("\t- 200Gb memory");
        System.out.println("\t- 4Gb RAM");
    }
}
