
public class Vehiculos
{
    private String color;
    private String marca;
    private String ruedas;
    private String tipo;
    private String costo;
    private String suspencion;

    public Vehiculos(String color,String marca,String ruedas,String tipo, String costo,String suspencion)
    {
        this.color=color;
        this.marca=marca;
        this.ruedas=ruedas;
        this.tipo=tipo;
        this.costo=costo;
        this.suspencion=suspencion;
    }

    public void setColor(String color){
        this.color=color;
    }

    public String getColor(){
        return color;
    }

    public void setMarca(String marca){
        this.marca=marca;
    }

    public String getMarca(){
        return marca;
    }

    public void setRuedas(String ruedas){
        this.ruedas=ruedas;
    }

    public String getRuedas(){
        return ruedas;
    }

    public void setTipo(String tipo){
        this.tipo=tipo;
    }

    public String getTipo(){
        return tipo;
    }

    public void setCosto(String costo){
        this.costo=costo;
    }

    public String getCosto(){
        return costo;
    }

    

    public void setSuspecion(String suspencion){
        this.suspencion=suspencion;
    }

    public String getSuspencion(){
        return suspencion;
    }
}
