package executavel;

import aplicativo.Calculadora;

import java.util.Scanner; // Importa a classe Scanner para leitura de entrada do usuário

public class Main {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in); // Cria um objeto Scanner para ler a entrada do usuário
		Calculadora calculadora = new Calculadora(); // Cria uma instância da classe Calculadora

		// Solicitar entrada do usuário para o primeiro número
		System.out.print("Digite o primeiro número: ");
		String input1 = scanner.nextLine(); // Lê a entrada como uma String

		// Solicitar entrada do usuário para o segundo número
		System.out.print("Digite o segundo número: ");
		String input2 = scanner.nextLine(); // Lê a entrada como uma String

		// Identificar se o primeiro número é um inteiro
		boolean isInt1 = input1.matches("-?\\d+");
		// Identificar se o segundo número é um inteiro
		boolean isInt2 = input2.matches("-?\\d+");

		// Identificar se o primeiro número é um double
		boolean isDouble1 = input1.matches("-?\\d+\\.\\d+");
		// Identificar se o segundo número é um double
		boolean isDouble2 = input2.matches("-?\\d+\\.\\d+");

		// Exibe as opções de operações para o usuário
		System.out.println("Escolha a operação: ");
		System.out.println("1. Adição");
		System.out.println("2. Subtração");
		System.out.println("3. Multiplicação");
		System.out.println("4. Divisão");

		// Lê a escolha da operação do usuário
		int escolha = scanner.nextInt();

		try {
			switch (escolha) {
			case 1: // Se a operação escolhida for Adição
				// Verifica se ambos os números são inteiros
				if (isInt1 && isInt2) {
					// Chama o método de adição para inteiros
					System.out.println("Adição (int): "
							+ calculadora.adicionar(Integer.parseInt(input1), Integer.parseInt(input2)));
				} else {
					// Chama o método de adição para doubles
					System.out.println("Adição (double): "
							+ calculadora.adicionar(Double.parseDouble(input1), Double.parseDouble(input2)));
				}
				break;
			case 2: // Se a operação escolhida for Subtração
				if (isInt1 && isInt2) {
					System.out.println("Subtração (int): "
							+ calculadora.subtrair(Integer.parseInt(input1), Integer.parseInt(input2)));
				} else {
					System.out.println("Subtração (double): "
							+ calculadora.subtrair(Double.parseDouble(input1), Double.parseDouble(input2)));
				}
				break;
			case 3: // Se a operação escolhida for Multiplicação
				if (isInt1 && isInt2) {
					System.out.println("Multiplicação (int): "
							+ calculadora.multiplicar(Integer.parseInt(input1), Integer.parseInt(input2)));
				} else {
					System.out.printf("Multiplicação (double): %.2f%n"
							, calculadora.multiplicar(Double.parseDouble(input1), Double.parseDouble(input2)));
				}
				break;
			case 4: // Se a operação escolhida for Divisão
				if (isInt1 && isInt2) {
					System.out.println("Divisão (int): "
							+ calculadora.dividir(Integer.parseInt(input1), Integer.parseInt(input2)));
				} else {
					System.out.printf("Divisão (double): %.2f%n"
							, calculadora.dividir(Double.parseDouble(input1), Double.parseDouble(input2)));
				}
				break;
			default: // Se a operação escolhida não for válida
				System.out.println("Operação inválida!");
				break;
			}
		} catch (ArithmeticException e) { // Captura exceções de divisão por zero
			System.out.println(e.getMessage());
		} finally {
			scanner.close(); // Fecha o Scanner para liberar os recursos
		}
	}
}
