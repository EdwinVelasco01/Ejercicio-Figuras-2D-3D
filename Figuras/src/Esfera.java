public class Esfera extends Circulo {

    private double radio;
    private double pi;

    public Esfera(String nombre, double radio)
    {
        super(nombre, radio);
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

    public double calcularPerimetro() {
        return Math.pow(this.getRadio(), 2)*this.getPi();
    }
    public double calcularVolumen(){
        return Math.pow(this.getRadio(), 3)*this.getPi()*4/3;
    }

    @Override
    public double calcularArea()
    {
        return 4*pi*Math.pow(radio,2);
    }

    @Override
    public String toString()
    {
        return super.toString()+"\nRadio: "+radio+"\nPi: "+pi;
    }

}