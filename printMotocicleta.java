
public class printMotocicleta extends Motocicleta
{
    public printMotocicleta(String color,String marca,String ruedas,String tipo, String costo,String suspencion,String motor,String capacidad,String rendimiento,String categoria)
    {
        super(color,marca,ruedas,tipo,costo,suspencion,motor,capacidad,rendimiento,categoria);
    }

    public void imprimir(){
        System.out.println("El color es: " + getColor());
        System.out.println("La marca es: " + getMarca());
        System.out.println("Las ruedas son: " + getRuedas());
        System.out.println("Es de tipo: " + getTipo());
        System.out.println("El costo es de: " + getCosto());
        System.out.println("La suspencion es: " + getSuspencion());
        System.out.println("El motor es: " + getMotor());
        System.out.println("La capacidad es de: " + getCapacidad());
        System.out.println("Tiene un consumo de: " + getRendimiento());
        System.out.println("La categoria es: " + getCategoria());
    }
}
