package Semana1;

public class PruebaBicicleta {
    public static void main(String[] args) {
        def();
    }

    public static void def() {
        Bicicleta mountainBike = new Bicicleta();
        mountainBike.setColor("");
        mountainBike.setPins(8);
        mountainBike.setRodada(-27);
        mountainBike.setVelocidad(13.2);
        String msg = "Soy una bicicleta mountain con estas caracteristicas: \n";
        msg += "Color: "+mountainBike.getColor()+"\n";
        msg += "Velocidad: "+mountainBike.getVelocidad()+"\n";
        msg += "Pins: "+mountainBike.getPins()+"\n";
        msg += "Rodada: "+mountainBike.getRodada();

        System.out.print(msg);
    }

}
