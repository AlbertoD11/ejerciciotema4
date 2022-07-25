package Herencia;

import Clase.SmartDevice;

public class SmartPhone extends SmartDevice {

    int ram;

    public SmartPhone(){
        super();

    }

    public SmartPhone(String marca, String modelo, String color, int numserie, String camara, int ram) {
        super(marca, modelo, color, numserie, camara);
        this.ram = ram;
    }

    @Override
    public String toString() {
        return "SmartPhone{" +
                "ram=" + ram +
                ", marca='" + marca + '\'' +
                ", modelo='" + modelo + '\'' +
                ", color='" + color + '\'' +
                ", numserie=" + numserie +
                ", camara='" + camara + '\'' +
                ", velocidadcarga=" + velocidadcarga +
                '}';
    }
}
