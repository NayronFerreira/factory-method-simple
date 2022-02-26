import factory.PlaystationFactory;
import model.Playstation;

public class ClientSimple {

    public static void main(String[] args){
        PlaystationFactory playstationSlimFactory = new PlaystationFactory();
        System.out.println("### Ording an Playstation2");
        Playstation playstation2 = playstationSlimFactory.orderPlaystation("Full", "wired");
        System.out.println(playstation2);
        System.out.println("### Ording an Playstation5");
        Playstation playstation5 = playstationSlimFactory.orderPlaystation("Slim", "wirelles 3.0");
        System.out.println(playstation5);
    }
}
