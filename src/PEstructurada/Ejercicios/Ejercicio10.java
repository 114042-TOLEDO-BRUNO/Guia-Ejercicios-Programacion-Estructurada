package PEstructurada.Ejercicios;

import org.w3c.dom.ls.LSOutput;

import java.util.Scanner;

public class Ejercicio10
{
    //Ingresar un número y validar que sea positivo. Si no lo es continuar
    //solicitándolo al usuario hasta que ingrese un número correcto
    public static void main(String[] args)
    {
        Scanner read=new Scanner(System.in);
        int number;
        System.out.println("Ingrese un numero");
        number=read.nextInt();
        while (number<=0)
        {
            System.out.println("Ingrese un numero valido");
            number=read.nextInt();
        }
        System.out.println("El numero "+number+" es positivo");
    }


}
