
public class Motor extends Vehiculos
{
    private String motor;
    private String capacidad;
    private String rendimiento;
    public Motor(String color,String marca,String ruedas,String tipo, String costo,String suspencion,String Motor,String capacidad,String rendimiento)
    {
        super(color,marca,ruedas,tipo,costo,suspencion);
        this.motor=motor;
        this.capacidad=capacidad;
        this.rendimiento=rendimiento;
        }

    public void setMotor(String motor){
        this.motor=motor;
    }

    public String getMotor(){
        return motor;
    }
    public void setCapacidad(String capacidad){
        this.capacidad=capacidad;
    }

    public String getCapacidad(){
        return capacidad;
    }

    public void setRendimiento(String rendimiento){
        this.rendimiento=rendimiento;
    }

    public String getRendimiento(){
        return rendimiento;
    }
}
