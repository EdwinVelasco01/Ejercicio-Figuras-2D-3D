import java.util.Scanner;
import java.util.List;
import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        List <Figura> miLista = new ArrayList<>();
        int opcion = 0;
        int indice = 0;
        do
        {
            vaciar();
            opcion = genPrincipal(sc);
            switch(opcion)
            {
                case 1:
                    do {
                        vaciar();
                        opcion = genMenuAgregar(sc);
                        vaciar();
                        agregarFigura(sc, opcion, miLista);
                    } while(opcion != 7);
                    break;
                case 2:
                    do
                    {
                        vaciar();
                        if(!miLista.isEmpty())
                        {
                            opcion = imprimirFiguras(sc,miLista,indice);
                        }
                        else
                        {
                            System.out.println("No hay objetos en la lista");
                            opcion = 3;
                            sc.nextLine();
                        }
                        indice = darIndice(opcion, indice, miLista);
                    } while(opcion !=3);
                    break;
            }
        } while(opcion != 0);
    }

    private static int genPrincipal(Scanner sc)
    {
        System.out.println("1. Crear figura\n2. Ver figuras\n0. Salir");
        System.out.print("Ingrese la opcion: ");
        return Integer.parseInt(sc.nextLine());
    }
    private static int genMenuAgregar(Scanner sc)
    {
        System.out.println("Figura 2D\n \n1. Circulo\n2. Triangulo\n3. Cuadrado\n \nFigura 3D\n \n4. Tetraedro\n5. Esfera \n6. Cubo\n7. Regresar");
        System.out.print("\nIngrese la opcion: ");
        return Integer.parseInt(sc.nextLine());
    }

    private static void vaciar()
    {
        for (int clear = 0; clear < 1000; clear++) {
            System.out.println("\b");
        }
    }

    private static void agregarFigura(Scanner sc, int opcion, List miLista)
    {
        double radio;
        double lado;
        switch(opcion)
        {
            case 1:
                System.out.print("Ingrese el radio: ");
                radio = Double.parseDouble(sc.nextLine());
                miLista.add(new Circulo("Circulo", radio));
                break;

            case 2:
                double a, b, c;
                System.out.print("Ingrese el lado A: ");
                a = Double.parseDouble(sc.nextLine());
                System.out.print("Ingrese el lado B: ");
                b = Double.parseDouble(sc.nextLine());
                System.out.print("Ingrese el lado C: ");
                c = Double.parseDouble(sc.nextLine());
                miLista.add(new Triangulo("Triangulo", a,b,c));
                break;
            case 3:
                System.out.print("Ingrese el lado: ");
                lado = Double.parseDouble(sc.nextLine());
                miLista.add(new Cuadrado("Cuadrado", lado));
                break;

            case 4:
                double arista;
                System.out.print("Ingrese la arista: ");
                arista = Double.parseDouble(sc.nextLine());
                miLista.add(new Tetraedro("Tetraedro", arista));
                break;
            case 5:
                System.out.print("Ingrese el radio: ");
                radio = Double.parseDouble(sc.nextLine());
                miLista.add(new Esfera("Esfera", radio));
                break;
            case 6:
                System.out.print("Ingrese el lado: ");
                lado = Double.parseDouble(sc.nextLine());
                miLista.add(new Cubo("Cubo", lado));
                break;

        }
    }
    private static int imprimirFiguras(Scanner sc, List<Figura> miLista, int indice)
    {
        Figura miFigura = miLista.get(indice);
        if(miFigura instanceof Circulo)
        {
            if (miFigura instanceof Esfera) {
                Esfera esfera = (Esfera) miFigura;
                System.out.println(esfera +"\nPerimetro:" + esfera.calcularPerimetro() + "\nArea: " + esfera.calcularArea() + "\nVolumen: " + esfera.calcularVolumen());

            }
            else
            {
                Circulo miCirculo = (Circulo)miFigura;
                System.out.println(miCirculo+"\nPerimetro: "+miCirculo.calcularPerimetro()+"\nArea: "+miCirculo.calcularArea());
            }
        }
        else if(miFigura instanceof Triangulo)
        {
            if (miFigura instanceof Tetraedro) {
                Tetraedro tetra = (Tetraedro) miFigura;
                System.out.println(tetra + "\nArea: " + tetra.calcularArea() + "\nVolumen: " + tetra.calcularVolumen());
            }
            else
            {
                Triangulo trian = (Triangulo)miFigura;
                System.out.println(trian+"\nPerimetro: "+trian.calcularPerimetro()+"\nArea: "+trian.calcularArea());
            }
        } else if (miFigura instanceof Cuadrado)
        {
            if (miFigura instanceof Cubo){
                Cubo cubo= (Cubo) miFigura;
                System.out.println(cubo + "\nPerimetro: " + cubo.calcularPerimetro() + "\nArea: " + cubo.calcularArea());
            }
            else
            {
                Cuadrado cuadrado= (Cuadrado) miFigura;
                System.out.println(cuadrado + "\nPerimetro: " + cuadrado.calcularPerimetro() + "\nArea: " + cuadrado.calcularArea());
            }

        }
        System.out.println("\n1. Anterior\n2. Siguiente\n3. Regresar\n");
        System.out.print("Ingrese una opcion: ");
        int opcion = Integer.parseInt(sc.nextLine());
        return opcion;
    }

    private static int darIndice(int opcion, int indice, List miLista)
    {
        switch(opcion)
        {
            case 1:
                if (indice - 1 >= 0) {
                    indice -= 1;
                }
                break;
            case 2:
                if (indice + 1 < miLista.size()) {
                    indice += 1;
                }
                break;
        }
        return indice;
    }
}