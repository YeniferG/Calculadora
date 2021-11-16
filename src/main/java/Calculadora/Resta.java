package Calculadora;

public class Resta extends Operaciones{

    double resultadoResta;

    @Override
    public String calculadora(double num1, double num2) {
        resultadoResta = num1 - num2;
        return "El resultado de la operación resta es: " + resultadoResta;
    }
}
