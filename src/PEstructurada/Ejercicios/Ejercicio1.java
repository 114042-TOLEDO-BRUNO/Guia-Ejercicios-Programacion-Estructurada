package PEstructurada.Ejercicios;

import java.util.Scanner;
public class Ejercicio1
{
    // Declarar dos variables enteras y cargar sus valores por teclado. Informar su
    //suma, diferencia, producto y cociente.
    public static void main(String[] args)
    {
        Scanner leer=new Scanner(System.in);
        System.out.println("Ingrese un numero");
        double num1=leer.nextInt();
        System.out.println("Ingrese otro numero");
        double num2=leer.nextInt();
        double suma=num1+num2;
        double diferencia=num1-num2;
        double producto=num1*num2;
        double cociente=num1/num2;
        System.out.println("La suma de los numeros es: "+suma);
        System.out.println("La diferencia de los numeros es: "+ diferencia);
        System.out.println("El producto de los numeros es: "+producto);
        System.out.printf("El cociente de los numeros es: %.2f",cociente);

    }

}
