public class Motocicleta extends Motor
{
    private String categoria;
    
    public Motocicleta(String color,String marca,String ruedas,String tipo, String costo,String suspencion,String motor,String capacidad,String rendimiento,String categoria)
    {
        super(color,marca,ruedas,tipo,costo,suspencion,motor,capacidad,rendimiento);
        this.categoria=categoria;
    }

    public void setCategoria(String categoria)
    {
        this.categoria=categoria;
    }

    public String getCategoria(){
        return categoria;
    }

    
}
