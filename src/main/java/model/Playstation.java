package model;

public abstract class Playstation {

    public abstract void getHardware();

    public void assemble() {
        System.out.println("Montar todo o hardware");
    }

    public void certificates() {
        System.out.println("Testando todos os certificados");
    }

    public void pack() {
        System.out.println("Empacotando todo o dispositivo");
    }

}
