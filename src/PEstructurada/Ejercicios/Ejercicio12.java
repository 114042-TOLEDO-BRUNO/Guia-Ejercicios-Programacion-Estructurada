package PEstructurada.Ejercicios;


import java.util.Scanner;
public class Ejercicio12
{
    //.Desarrollar un programa que permita ingresar la antigüedad de los autos de una
    //concesionaria de usados. Finalizar la carga cuando se ingrese 0. Por cada
    //auto ingresado mostrar por pantalla un mensaje adecuado con el siguiente
    //criterio: si el auto tiene entre 1 y 5 años mostrar el texto “NUEVO”, si tiene
    //entre 6 y 10 mostrar “POCO USO”, si tiene entre 11 y 20 “MUCHO USO” y si
    //tiene más de 20 “MUY ANTIGUO”.
    //Luego de finalizada la carga calcular y mostrar los siguientes resultados:
    //• Cantidad total de autos.
    //• Cantidad de autos con poco uso.
    //• Promedio de antigüedad de los autos que no sean muy antiguos.
    public static void main(String[] args)
    {
        Scanner read=new Scanner(System.in);
        int littleUse=0;
        int newCar=0;
        int muchUse=0;
        int vintage=0;
        int years=0;
        System.out.println("Ingrese la antiguedad del vehiculo");
        int antiquity=read.nextInt();
        while(antiquity!=0)
        {
            if(antiquity>=1 && antiquity<=5)
            {
                System.out.println("NUEVO");
                years=years+antiquity;
                newCar++;
            }

            else if(antiquity>=6 && antiquity<=10)
            {
                System.out.println("POCO USO");
                years=years+antiquity;
                littleUse++;
            }
            else if (antiquity>=11 && antiquity<=20)
            {
                System.out.println("MUCHO USO");
                years=years+antiquity;
                muchUse++;
            }
            else
            {
                System.out.println("MUY ANTIGUO");
                vintage++;
            }
            antiquity=read.nextInt();
        }
        int totalCar=littleUse+newCar+muchUse+vintage;//despues de procesar los datos
        double average=years/(totalCar-vintage);
        System.out.println("Cantidad total de autos: "+totalCar);
        System.out.println("Cantidad de autos con poco uso: "+littleUse);
        System.out.println("Promedio de antiguedad de los autos que no son antiguos: "+average);
    }
}
