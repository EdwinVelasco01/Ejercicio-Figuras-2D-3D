public class Cubo extends Cuadrado{

    private double lado;

    public Cubo(String nombre, double lado)
    {
        super(nombre, lado);
        this.lado = lado;
    }

    public double getAncho()
    {
        return lado;
    }

    public double getLargo()
    {
        return lado;
    }

    public double calcularPerimetro()
    {
        return 12*lado;
    }
    @Override
    public double calcularArea()
    {
        return 6*Math.pow(lado, 2);
    }
    @Override
    public String toString()
    {
        return super.toString()+"\nAltura: "+lado +"\nAncho: "+lado;
    }

}
