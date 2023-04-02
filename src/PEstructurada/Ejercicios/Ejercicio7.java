package PEstructurada.Ejercicios;
import java.util.Scanner;
public class Ejercicio7 {
    //Una empresa de alquiler de autos cobra $300 por día si no se superan los 200
    //km de uso diario. Por cada km extra hasta los 1000 km cobra $5 adicionales,
    //y a partir de los 1000 cobra $10 adicionales. Hacer un programa que solicite
    //la cantidad de km realizados por un cliente e indique el importe que se le debe
    //cobrar.
    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);
        int price=300;
        double priceOfDay=0;
       System.out.println("app para cobro de alquiler de vehiculos");
        System.out.println("Ingresar los kilometros realizados");
        int kilometers=read.nextInt();
        int aditionalKilometers=kilometers-200;

        if(kilometers<=200 && kilometers>0)
        {
            priceOfDay=price;
        }
        else if(kilometers>200 && kilometers<=1000)
            {
                priceOfDay=price+aditionalKilometers*5;
            }
            else if(kilometers>1000)
                {
                    priceOfDay=price+aditionalKilometers*10;
                }
                else System.out.println("el numero ingresado es 0 o valor negativo");

        System.out.println("El saldo a cobrar al cliente es de $"+priceOfDay);

    }
}
