package Semana1;

public class pruebaAutoTransformer {
    public static void main(String[] args) {
        def();
    }

    public static void def(){
        AutoTransformer ranfla = new AutoTransformer();
        ranfla.setNombre("Mini Tron");
        ranfla.setBando("Villanos");
        ranfla.setTipoVehiculo("Ranfla");
        ranfla.setColorPrincipal("Rojo");
        ranfla.setColorSecundario("Negro");
        ranfla.setTipoTransformacion("Humanoide");
        ranfla.setTransformaciones(2);
        ranfla.setVelocidadVehiculo(200);
        ranfla.setVelocidadPie(90);
        ranfla.setTipoCombustible("Premium");
        ranfla.setAsientos(2);
        ranfla.setRuedas(4);
        ranfla.setTransformado(true);

        String msg = "Soy un auto transformer y esta es mi informacion: \n";
        msg += "Nombre: "+ranfla.getNombre()+"\n";
        msg += "Bando: "+ranfla.getBando()+"\n";
        msg += "Tipo de vehiculo: "+ranfla.getTipoVehiculo()+"\n";
        msg += "Color principal: "+ranfla.getColorPrincipal()+"\n";
        msg += "Color secundario: "+ranfla.getColorSecundario()+"\n";
        msg += "Tipo de transformacion: "+ranfla.getTipoTransformacion()+"\n";
        msg += "No. de transformaciones: "+ranfla.getTransformaciones()+"\n";
        msg += "Velocidad en forma de vehiculo: "+ranfla.getVelocidadVehiculo()+"\n";
        msg += "Velocidad en transformacion: "+ranfla.getVelocidadPie()+"\n";
        msg += "Tipo de combustible: "+ranfla.getTipoCombustible()+"\n";
        msg += "Asientos: "+ranfla.getAsientos()+"\n";
        msg += "No. de ruedas: "+ranfla.getRuedas()+"\n";
        msg += "Se encuentra transformado: "+ranfla.getTransformado();


        System.out.print(msg);
    }
}
