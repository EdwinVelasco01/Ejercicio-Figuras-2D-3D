public class Cuadrado extends Figura{

    private double lado;

    public Cuadrado(String nombre, double lado)
    {
        super(nombre);
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
        return 4*lado;
    }
    @Override
    public double calcularArea()
    {
        return lado*lado;
    }
    @Override
    public String toString()
    {
        return super.toString()+"\nAncho: "+lado+"\nLargo: "+lado;
    }

}