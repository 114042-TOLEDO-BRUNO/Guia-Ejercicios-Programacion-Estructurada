package PEstructurada.Ejercicios;

import java.util.Scanner;

public class Ejercicio2
{
    //Hacer un programa que ingrese el precio de un artículo a la venta y calcule el
    //precio con IVA.
    public static void main(String[] args)
    {
        Scanner leerPrecio=new Scanner(System.in);
        System.out.println("Ingrese el precio del articulo");
        double precio= leerPrecio.nextDouble();
        final int iva=21;
        double precioConIva=precio+precio*iva/100;
        System.out.println("El precio con IVA del Articulo es: "+precioConIva);
    }
}
