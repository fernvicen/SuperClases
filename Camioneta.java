
public class Camioneta extends Motor
{
    private String carga;
    private String funcion;
    private String combustible;
    public Camioneta(String color,String marca,String ruedas,String tipo, String costo,String suspencion,String motor,String capacidad,String rendimiento,String carga,String funcion,String combustible)
    {
        super(color,marca,ruedas,tipo,costo,suspencion,motor,capacidad,rendimiento);
        this.carga=carga;
        this.funcion=funcion;
        this.combustible=combustible;
    }

    public void setCarga(String carga){
        this.carga=carga;
    }

    public String getCarga(){
        return carga;
    }

    public void setFuncion(String funcion){
        this.funcion=funcion;
    }

    public String getFuncion(){
        return funcion;
    }

    public void setCombustible(String combustible){
        this.combustible=combustible;
    }

    public String getCombustible(){
        return combustible;
    }
}
