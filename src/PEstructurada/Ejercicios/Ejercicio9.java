package PEstructurada.Ejercicios;

import java.util.List;
import java.util.Scanner;
public class Ejercicio9
{
    //Ingresar un número n y a continuación n números positivos. Informar la
    //cantidad de mayores a 5 que se hayan ingresado.
    public static void main(String[] args)
    {
        Scanner read=new Scanner(System.in);
        int number,count;
        char accept='s';
        count=0;
        while(accept=='s')
        {
            System.out.println("Ingrese un numero");
            number=read.nextInt();
            if(number>5)
            {
                count++;
            }
            System.out.println("Desea ingresar otro numero?");
            accept=read.next().charAt(0);
        }
        System.out.println("La cantidad de numeros mayores a 5 es: "+count);
    }
}
