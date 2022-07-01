
public class Bicicleta extends Vehiculos
{
    private String rodada;
    private String estructura;
    public Bicicleta(String color,String marca,String ruedas,String tipo, String costo,String suspencion,String rodada,String estructura)
    {
        super(color,marca,ruedas,tipo,costo,suspencion);
        this.rodada=rodada;
        this.estructura=estructura;
    }

    public void setRodada(String rodada){
        this.rodada=rodada;
    }

    public String getRodada(){
        return rodada;
    }

    public void setEstructura(String estructura){
        this.estructura=estructura;
    }

    public String getEstructura(){
        return estructura;
    }
}
