public class Circulo extends Figura{

    private double radio;
    private double pi;

    public Circulo(String nombre, double radio)
    {
        super(nombre);
        this.radio = radio;
        pi = Math.PI;
    }

    public double getRadio()
    {
        return radio;
    }

    public double getPi()
    {
        return pi;
    }

    public double calcularPerimetro()
    {
        return 2*pi*radio;
    }

    @Override
    public double calcularArea()
    {
        return pi*Math.pow(radio,2);
    }

    @Override
    public String toString()
    {
        return super.toString()+"\nRadio: "+radio+"\nPi: "+pi;
    }
}
