
public class Auto extends Motor
{
    private String placas;
    private String pasajeros;

    public Auto(String color,String marca,String ruedas,String tipo, String costo,String suspencion,String motor,String capacidad,String rendimiento,String placas,String pasajeros)
    {
        super(color,marca,ruedas,tipo,costo,suspencion,motor,capacidad,rendimiento);
        this.placas=placas;
        this.pasajeros=pasajeros;
    }

    public void setPlacas(String placas){
        this.placas=placas;
    }

    public String getPlacas(){
        return placas;
    }

    public void setPasajeros(String pasajeros){
        this.pasajeros=pasajeros;
    }

    public String getPasajeros(){
        return pasajeros;
    }
}
