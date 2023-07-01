public class Tetraedro extends Triangulo{
    private double arista;

    public Tetraedro(String nombre, double arista) {
        super(nombre, arista, arista, arista);
        this.arista = arista;
    }

    public double getArista()
    {
        return arista;
    }

    @Override
    public double calcularArea()
    {
        return 1.73205*arista;
    }

    public double calcularVolumen()
    {
        return 0.11785*arista;
    }

    @Override
    public String toString()
    {
        return "\nNombre: "+this.getNombre()+"\nArista: "+arista;
    }
}
