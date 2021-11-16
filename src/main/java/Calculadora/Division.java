package Calculadora;

public class Division extends Operaciones{

    double resultadoDivision;

    @Override
    public String calculadora(double num1, double num2) {
        resultadoDivision = num1 / num2;
        return "El resultado de la operación división es: " + resultadoDivision;
    }
}
