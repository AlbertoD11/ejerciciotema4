package Herencia;

import Clase.SmartDevice;

public class SmartWatch extends SmartDevice {

    double pulgadas;

    public SmartWatch() {
        super();
    }

    public SmartWatch(String marca, String modelo, String color, int numserie, String camara, double pulgadas) {
        super(marca, modelo, color, numserie, camara);
        this.pulgadas = pulgadas;
    }

    @Override
    public String toString() {
        return "SmartWatch{" +
                "pulgadas=" + pulgadas +
                ", marca='" + marca + '\'' +
                ", modelo='" + modelo + '\'' +
                ", color='" + color + '\'' +
                ", numserie=" + numserie +
                ", velocidadcarga=" + velocidadcarga +
                '}';
    }
}
