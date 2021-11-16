package Calculadora;

public class Multiplicacion extends Operaciones{

    double resultadoMultiplicacion;

    @Override
    public String calculadora(double num1, double num2) {
        resultadoMultiplicacion = num1 * num2;
        return "El resultado de la operacion multiplicacion es: " + resultadoMultiplicacion;
    }
}
