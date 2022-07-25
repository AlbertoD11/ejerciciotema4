package Clase;

import Herencia.SmartPhone;
import Herencia.SmartWatch;

public class Main {

    public static void main(String[] args) {

        // 1. clases y objetos
        // Clase identificador = new Clase();
        SmartDevice apple = new SmartDevice();


        SmartDevice xiaomi = new SmartDevice("Xiaomi", "RedmiNote11","azul",2245,"Sony");

        System.out.println(xiaomi.marca);
        System.out.println(xiaomi.modelo);
        System.out.println(xiaomi.color);
        xiaomi.bateria(20 );
        System.out.println(xiaomi.velocidadcarga); // 50


        // 2. herencia
        SmartPhone huawei = new SmartPhone();
        huawei.marca = "Huawei";


        System.out.println("fin de programa");

        // 3. polimorfismo
        SmartDevice smartDevice;

        smartDevice = new SmartPhone();
        smartDevice.bateria(20);

        smartDevice = new SmartWatch();
        smartDevice.bateria(20);


    }


}
