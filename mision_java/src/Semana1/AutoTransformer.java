package Semana1;

public class AutoTransformer {
    // Caracteristicas
    public int ruedas, asientos, transformaciones, velocidadVehiculo, velocidadPie;
    public String nombre, colorPrincipal, colorSecundario, tipoCombustible, tipoVehiculo, bando, tipoTransformacion;
    public boolean transformado;

    // Metodos
    public int getRuedas() { return ruedas; }
    public int getAsientos() { return asientos; }
    public int getTransformaciones() { return transformaciones; }
    public int getVelocidadVehiculo() { return velocidadVehiculo; }
    public int getVelocidadPie() { return velocidadPie; }
    public String getNombre() { return nombre; }
    public String getColorPrincipal() { return colorPrincipal; }
    public String getColorSecundario() { return colorSecundario; }
    public String getTipoCombustible() { return tipoCombustible; }
    public String getTipoVehiculo() { return tipoVehiculo; }
    public String getBando() { return bando; }
    public String getTipoTransformacion() { return tipoTransformacion; }
    public boolean getTransformado() { return transformado; };

    public boolean setRuedas(int ruedas){
        if (ruedas > 0){
            this.ruedas = ruedas;
            return true;
        } else
            return false;
    }

    public boolean setAsientos(int asientos){
        if (asientos > 0){
            this.asientos = ruedas;
            return true;
        } else
            return false;
    }

    public boolean setTransformaciones(int transformaciones){
        if (transformaciones > 0){
            this.transformaciones = transformaciones;
            return true;
        } else
            return false;
    }

    public boolean setVelocidadVehiculo(int velocidadVehiculo){
        if (velocidadVehiculo >= 0){
            this.velocidadVehiculo = velocidadVehiculo;
            return true;
        } else
            return false;
    }

    public boolean setVelocidadPie(int velocidadPie){
        if (velocidadPie > 0){
            this.velocidadPie = velocidadPie;
            return true;
        } else
            return false;
    }

    public boolean setNombre(String nombre){
        if (!nombre.isEmpty()){
            this.nombre = nombre;
            return true;
        } else
            return false;
    }

    public boolean setColorPrincipal(String colorPrincipal){
        if (!colorPrincipal.isEmpty()){
            this.colorPrincipal = colorPrincipal;
            return true;
        } else
            return false;
    }

    public boolean setColorSecundario(String colorSecundario){
        if (!colorSecundario.isEmpty()){
            this.colorSecundario = colorSecundario;
            return true;
        } else
            return false;
    }

    public boolean setTipoCombustible(String tipoCombustible){
        if (!tipoCombustible.isEmpty()){
            this.tipoCombustible = tipoCombustible;
            return true;
        } else
            return false;
    }

    public boolean setTipoVehiculo(String tipoVehiculo){
        if (!tipoVehiculo.isEmpty()){
            this.tipoVehiculo = tipoVehiculo;
            return true;
        } else
            return false;
    }

    public boolean setBando(String bando){
        if (!bando.isEmpty()){
            this.bando = bando;
            return true;
        } else
            return false;
    }

    public boolean setTipoTransformacion(String tipoTransformacion){
        if (!tipoTransformacion.isEmpty()){
            this.tipoTransformacion = tipoTransformacion;
            return true;
        } else
            return false;
    }

    public boolean setTransformado( boolean transformado){
        if (transformado != true || transformado != false){
            this.transformado = transformado;
            return true;
        }else
            return false;
    }

    public String printState(){
        return  "Nombre: "+nombre+"\n"+
                "Bando: "+bando+"\n"+
                "Tipo de vehiculo: "+tipoVehiculo+"\n"+
                "Color principal: "+colorPrincipal+"\n"+
                "Color secundario: "+colorSecundario+"\n"+
                "Tipo de transformacion: "+tipoTransformacion+"\n"+
                "No. de transformaciones: "+transformaciones+"\n"+
                "Velocidad en forma de vehiculo: "+velocidadVehiculo+"\n"+
                "Velocidad en transformacion: "+velocidadPie+"\n"+
                "Tipo de combustible: "+tipoCombustible+"\n"+
                "Asientos: "+asientos+"\n"+
                "No. de ruedas: "+ruedas+"\n"+
                "Se encuentra transformado: "+transformado;
    }


}
