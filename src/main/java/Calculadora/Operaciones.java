package Calculadora;

import java.util.Scanner;

public class Operaciones {

    Scanner entrada = new Scanner(System.in);

    private double resultado;
    private double num1, num2;

    public Operaciones(){}

    public String calculadora(double num1, double num2){
        return "El resultado de la Operación es: " + resultado;
    }

    public void iniciarCalculadora(){

        System.out.println("Por favor ingrese un numero: ");
        num1 = entrada.nextDouble();
        System.out.println("Por favor ingrese un nuevo numero: ");
        num2 = entrada.nextDouble();
        System.out.println(calculadora(num1, num2));

    }

}
