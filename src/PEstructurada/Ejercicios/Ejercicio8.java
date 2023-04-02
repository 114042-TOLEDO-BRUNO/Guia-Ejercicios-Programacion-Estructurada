package PEstructurada.Ejercicios;

import java.util.Scanner;

public class Ejercicio8
{
    //Ingresar 10 números por teclado, informar su suma y promedio
    public static void main(String[] args)
    {
        Scanner read=new Scanner(System.in);
        double adittion=0;
        double average=0;
        double[]numbers=new double[3];
        System.out.println("Ingresar "+numbers.length+" numeros");
        for(int i=0;i<numbers.length;i++)
        {
            numbers[i]=read.nextDouble();
            adittion=adittion+numbers[i];
            average=adittion/numbers.length;
        }
        System.out.println("la suma es "+adittion+", y el promedio es de "+average);
    }
}
