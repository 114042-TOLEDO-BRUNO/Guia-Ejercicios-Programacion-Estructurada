package PEstructurada.Ejercicios;

import java.util.Scanner;

public class Ejercicio11
{
    //.Ingresar el tiempo en segundos que realizó el ganador de la clasificación de
    //una carrera de F1. Luego ingresar los tiempos de los otros 9 corredores e
    //informar cuántos disputarán la carrera. Para que un corredor pueda participar
    //su tiempo de clasificación no puede superar en 15 % al del ganador.
    public static void main(String[] args)
    {
        Scanner read=new Scanner(System.in);
        System.out.println("Ingrese el tiempo del ganador de la clasificacion de la carrera");
        double[]time=new double[9];
        double bestTime=read.nextDouble();
        int countRacers=1;
        for(int i=0;i<time.length;i++)
        {
            System.out.println("ingrese el tiempo del piloto");
            time[i]=read.nextDouble();
            if(time[i]<=bestTime*1.15)
            {
                System.out.println("Clasificado");
                countRacers++;
            }
            else
            {
                System.out.println("No clasificado");
            }
        }
        System.out.println("Cantidad de pilotos clasificados: "+countRacers);
    }

}
