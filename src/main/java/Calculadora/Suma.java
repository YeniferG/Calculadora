package Calculadora;

public class Suma extends Operaciones{

    double resultadoSuma;

    @Override
    public String calculadora(double num1, double num2) {
        resultadoSuma = num1 + num2;
        return "El resultado de la operación suma es: " + resultadoSuma;
    }
}
