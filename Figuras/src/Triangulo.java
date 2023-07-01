public class Triangulo extends Figura{
    private double ladoA;
    private double ladoB;
    private double ladoC;
    private double semiPerimetro;

    public Triangulo(String nombre, double ladoA, double ladoB, double ladoC)
    {
        super(nombre);
        this.ladoA = ladoA;
        this.ladoB = ladoB;
        this.ladoC = ladoC;
        this.semiPerimetro = calcularSemiPerimetro();
    }

    public double getLadoA()
    {
        return ladoA;
    }
    public double getLadoB()
    {
        return ladoB;
    }
    public double getLadoC()
    {
        return ladoC;
    }
    public double getSemiPerimetro()
    {
        return semiPerimetro;
    }
    public double calcularPerimetro()
    {
        return ladoA+ladoB+ladoC;
    }

    private double calcularSemiPerimetro()
    {
        return calcularPerimetro()/2;
    }

    @Override
    public double calcularArea()
    {
        return Math.sqrt(semiPerimetro*(semiPerimetro-ladoA)*(semiPerimetro-ladoB)*(semiPerimetro-ladoC));
    }

    @Override
    public String toString()
    {
        return super.toString()+"\nLado A: "+ladoA+"\nLado B: "+ladoB+"\nLado C: "+ladoC+"\nSemiperimetro: "+semiPerimetro;
    }
}
