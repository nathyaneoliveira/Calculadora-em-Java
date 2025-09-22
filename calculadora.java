import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite o primeiro número: ");
        double num1 = scanner.nextDouble();

        System.out.print("Digite o segundo número: ");
        double num2 = scanner.nextDouble();

        System.out.println("Escolha a operação:");
        System.out.println("1-Adição");
        System.out.println("2-Subtração");
        System.out.println("3-Multiplicação");
        System.out.println("4-Divisão");
        System.out.println("5-Potenciação");
        System.out.println("6-Raiz Quadrada");
        System.out.println("7-Raiz Cúbica");
        System.out.println("8-Todas as operações");

        int escolha = scanner.nextInt();

        switch (escolha) {
            case 1:
                System.out.println("Resultado: " + (num1 + num2));
                break;
            case 2:
                System.out.println("Resultado: " + (num1 - num2));
                break;
            case 3:
                System.out.println("Resultado: " + (num1 * num2));
                break;
            case 4:
                System.out.println("Resultado: " + (num1 / num2));
                break;
            case 5:
                System.out.println("Resultado: " + Math.pow(num1, num2));
                break;
            case 6:
                System.out.println("Raiz quadrada de " + num1 + ": " + Math.sqrt(num1));
                System.out.println("Raiz quadrada de " + num2 + ": " + Math.sqrt(num2));
                break;
            case 7:
                System.out.println("Raiz cúbica de " + num1 + ": " + Math.cbrt(num1));
                System.out.println("Raiz cúbica de " + num2 + ": " + Math.cbrt(num2));
                break;
            case 8:
                System.out.println("Adição: " + (num1 + num2));
                System.out.println("Subtração: " + (num1 - num2));
                System.out.println("Multiplicação: " + (num1 * num2));
                System.out.println("Divisão: " + (num1 / num2));
                System.out.println("Potenciação: " + Math.pow(num1, num2));
                System.out.println("Raiz quadrada de " + num1 + ": " + Math.sqrt(num1));
                System.out.println("Raiz quadrada de " + num2 + ": " + Math.sqrt(num2));
                System.out.println("Raiz cúbica de " + num1 + ": " + Math.cbrt(num1));
                System.out.println("Raiz cúbica de " + num2 + ": " + Math.cbrt(num2));
                break;
            default:
                System.out.println("Opção inválida!");
                break;
        }

        scanner.close();
    }

}
