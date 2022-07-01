
public class printBicicleta extends Bicicleta
{
    public printBicicleta(String color,String marca,String ruedas,String tipo,String costo,String suspencion,String rodada,String estructura)
    {
        super(color,marca,ruedas,tipo,costo,suspencion,rodada,estructura);
    }

    public void imprimir(){
        System.out.println("El color es: " + getColor());
        System.out.println("La marca es: " + getMarca());
        System.out.println("Es de tipo: " + getTipo());
        System.out.println("La suspencion es: " + getSuspencion());
        System.out.println("Las ruedas son: " + getRuedas());
        System.out.println("La rodada es: " + getRodada());
        System.out.println("La estructura es de: " + getEstructura());
        System.out.println("El costo es de: " + getCosto());
    }
}
