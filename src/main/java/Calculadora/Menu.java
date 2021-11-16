package Calculadora;

import java.util.Scanner;

public class Menu {

    Scanner entrada = new Scanner(System.in);

    public void mostrarMenu(){
        System.out.println("Por favor seleciona una de las siguientes opciones: " +
                "\n1. Realizar una Suma " +
                "\n2. Realizar una resta " +
                "\n3. Realizar una multiplicación " +
                "\n4. Realizar una division");
    }

    public void cargarMenu(){
        mostrarMenu();
        int opcion = entrada.nextInt();

        switch (opcion){

            case 1: {
                System.out.println("*** SUMA ***");
                Suma suma = new Suma();
                suma.iniciarCalculadora();
                System.out.println("-------------------------------");
                mostrarMenuContinuar();
            }break;

            case 2: {
                System.out.println("*** RESTA ***");
                Resta resta = new Resta();
                resta.iniciarCalculadora();
                System.out.println("-------------------------------");
                mostrarMenuContinuar();
            }break;

            case 3: {
                System.out.println("*** MULTIPLICACIÓN ***");
                Multiplicacion multiplicacion = new Multiplicacion();
                multiplicacion.iniciarCalculadora();
                System.out.println("-------------------------------");
                mostrarMenuContinuar();
            }break;

            case 4: {
                System.out.println("*** DIVISIÓN ***");
                Division division = new Division();
                division.iniciarCalculadora();
                System.out.println("-------------------------------");
                mostrarMenuContinuar();
            }break;
            default: {
                System.out.println("Opcion Invalida!");
                mostrarMenuContinuar();
            }
        }
    }

    public void mostrarMenuContinuar(){

        System.out.println("¿Desea permanecer en la Calculadora? \n1. Continuar y volver al menu principal \n2. Salir");
        int continuar = entrada.nextInt();
        switch (continuar){
            case 1:{
                System.out.println("///////////////////////////////////////////////////\n");
                cargarMenu();
            }break;
            case 2:{
                System.out.println("***************************************************************");
                System.out.println("Gracias por utilizar nuestra Calculadora \n***VUELVE PRONTO***");
            }break;

            default:{
                System.out.println("!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!");
                System.out.println("Opcion Invalida! \nDigita una opción valida por favor: ");
                cargarMenu();
            }
        }
    }


}
