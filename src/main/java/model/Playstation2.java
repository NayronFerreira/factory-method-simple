package model;

public class Playstation2 extends Playstation {
    @Override
    public void getHardware() {
        System.out.println("Lista de Hardware");
        System.out.println("\t- 1 console Full");
        System.out.println("\t- 2 wired controls");
        System.out.println("\t- 1 memory card");
        System.out.println("\t- 1Gb RAM");
    }
}
