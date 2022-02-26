package factory;

import model.*;

public class PlaystationFactory {

    public static Playstation orderPlaystation(String consoleType, String controlsType) {
        Playstation device = null;

        if (consoleType.contains("Full")) {
            if (controlsType.contains("wirelles")) {
                device = new Playstation3();
            } else {
                device = new Playstation2();
            }
        } else if (consoleType.contains("Slim")) {
            if (controlsType.contains("wirelles 3.0")) {
                device = new Playstation5();
            } else {
                device = new Playstation4();
            }
        }
        if (device != null){
            device.getHardware();
            device.assemble();
            device.certificates();
            device.pack();
        }

        return device;
    }
}
