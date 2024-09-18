package aplicativo;

public class Calculadora {
	// Método para adição que retorna int
    public int adicionar(int a, int b) {
        return a + b;
    }

    // Método para adição que retorna double
    public double adicionar(double a, double b) {
        return a + b;
    }

    // Método para subtração que retorna int
    public int subtrair(int a, int b) {
        return a - b;
    }

    // Método para subtração que retorna double
    public double subtrair(double a, double b) {
        return a - b;
    }

    // Método para multiplicação que retorna int
    public int multiplicar(int a, int b) {
        return a * b;
    }

    // Método para multiplicação que retorna double
    public double multiplicar(double a, double b) {
        return a * b;
    }

    // Método para divisão que retorna int
    public int dividir(int a, int b) {
        if (b == 0) {
            throw new ArithmeticException("Divisão por zero não é permitida.");
        }
        return a / b;
    }

    // Método para divisão que retorna double
    public double dividir(double a, double b) {
        if (b == 0) {
            throw new ArithmeticException("Divisão por zero não é permitida.");
        }
        return a / b;
    }
}
