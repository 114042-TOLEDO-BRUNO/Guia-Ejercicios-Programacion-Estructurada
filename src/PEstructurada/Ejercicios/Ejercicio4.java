package PEstructurada.Ejercicios;

import java.util.Scanner;

public class Ejercicio4
{
    //Ingresar nombre y altura de dos personas, informar el nombre de la más alta.
    public static void main(String[] args) {
        Scanner read=new Scanner(System.in);
        String[] names=new String[2];
        String morePerson="";
        double[] heigths=new double[2];
        double more=0;
        for(int i=0;i<names.length;i++)
        {

            System.out.println("Ingrese el nombre de una persona");
            names[i]=read.next();
            System.out.println("Ingrese su altura en mts");
            heigths[i]=read.nextDouble();
            if(heigths[i]>more)
            {
                morePerson=names[i];
                more=heigths[i];
            }
        }
        System.out.println("La persona mas alta es "+morePerson+", con "+more+" mts");
    }

}
