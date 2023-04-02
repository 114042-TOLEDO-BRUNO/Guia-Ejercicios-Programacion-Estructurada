package PEstructurada.Ejercicios;

import java.util.Scanner;

public class Ejercicio6
{
    // Ingresar un año e indicar si ese año es bisiesto. Un año es bisiesto si es
    //múltiplo de 4 y no es múltiplo de 100 o si es múltiplo de 400.
    public static void main(String[] args)
    {
        Scanner read=new Scanner(System.in);
        System.out.println("App para saber si un año es bisiesto");
        System.out.println("Ingrese el año");
        int year=read.nextInt();
        if(year %4 ==0 && year %100 !=0 || year %400 ==0)
        {
            System.out.println("El año "+year+" es bisiesto!");
        }
        else
            System.out.println("El año "+year+" no es bisiesto!");
    }
}
