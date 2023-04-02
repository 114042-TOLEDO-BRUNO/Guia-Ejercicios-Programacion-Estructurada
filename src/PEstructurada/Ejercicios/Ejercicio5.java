package PEstructurada.Ejercicios;

import java.util.Scanner;

public class Ejercicio5
{
    //Ingresar la cantidad de horas trabajadas por un empleado y el sueldo que
    //cobra por hora. Indique el total a cobrar teniendo en cuenta que si trabajó más
    //de 180 horas las excedentes las cobra con un 50 % de aumento
    public static void main(String[] args)
    {
        Scanner read=new Scanner(System.in);
        System.out.println("Ingrese el nombre del empleado");
        String name=read.next();
        System.out.println("Ingresar las horas trabajadas");
        int hours=read.nextInt();
        System.out.println("Ingresar el sueldo por hora en pesos");
        double price=read.nextDouble();
        double totalReceivable=hours*price;
        if(hours>180)
        {
            totalReceivable=totalReceivable+totalReceivable*0.5;
        }
        System.out.println("El empleado "+name+" cobra un total de $"+totalReceivable);
    }
}
