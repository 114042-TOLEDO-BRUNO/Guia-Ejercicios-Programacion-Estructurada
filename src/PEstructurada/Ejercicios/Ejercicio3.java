package PEstructurada.Ejercicios;

import java.util.Scanner;

public class Ejercicio3 {
    public static void main(String[] args)
    {
        // Hacer un programa que ingrese los datos de una factura en la cual haya tres
        //artículos vendidos. De cada artículo ingresar el precio unitario y la cantidad.
        //Finalmente imprimir el total de la factura
        Scanner read=new Scanner(System.in);
        String[] products=new String[3];
        double unitPrice;
        double quantity;
        double totalCharged=0;
        for(int i=0;i<products.length;i++)
        {
            System.out.println("Ingrese el producto");
            products[i]=read.next();
            System.out.println("Ingrese el precio unitario");
            unitPrice=read.nextDouble();
            System.out.println("Ingrese su cantidad");
            quantity=read.nextDouble();
            totalCharged=totalCharged+unitPrice*quantity;
        }
        System.out.println("El total facturado es de "+totalCharged);

    }
}
