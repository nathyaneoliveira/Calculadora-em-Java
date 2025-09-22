# 🧮 Calculadora Avançada em Java

## Descrição
Este projeto implementa uma **calculadora em Java** capaz de realizar operações matemáticas básicas e avançadas:  

- **Adição (+)**  
- **Subtração (-)**  
- **Multiplicação (*)**  
- **Divisão (/)**  
- **Potenciação**  
- **Raiz Quadrada**  
- **Raiz Cúbica**  
- **Todas as operações** de uma vez  

O usuário informa dois números e escolhe a operação desejada, e o programa retorna o resultado.

---

## Funcionalidades

- Entrada de **dois números** pelo usuário;
- Menu de **opções de operação**;
- Operações básicas: adição, subtração, multiplicação e divisão;
- Operações avançadas: potenciação, raiz quadrada e cúbica;
- Opção de **realizar todas as operações de uma vez**;
- Validação de opções inválidas.

---

## Código Principal

```java
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
````

---

## Requisitos

* Java JDK 11 ou superior;
* IDE ou editor de texto (IntelliJ, Eclipse, VS Code, etc.);
* Conhecimentos básicos de terminal ou console para execução.

---

## Execução

1. Abra o terminal ou console;
2. Navegue até a pasta do arquivo `Main.java`;
3. Compile o programa:

```bash
javac Main.java
```

4. Execute o programa:

```bash
java Main
```

5. Siga as instruções do menu e insira os números e operação desejada.

---

## Exemplo de Uso

```text
Digite o primeiro número: 10
Digite o segundo número: 5
Escolha a operação:
1-Adição
2-Subtração
3-Multiplicação
4-Divisão
5-Potenciação
6-Raiz Quadrada
7-Raiz Cúbica
8-Todas as operações
1
Resultado: 15.0
```

```text
Digite o primeiro número: 9
Digite o segundo número: 16
Escolha a operação:
6
Raiz quadrada de 9: 3.0
Raiz quadrada de 16: 4.0
```

---

## Contribuição

Este projeto pode ser expandido com:

* Suporte a mais operações matemáticas avançadas;
* Validação de entrada para evitar erros (como divisão por zero);
* Loop contínuo para realizar várias operações sem reiniciar;
* Interface gráfica com Swing ou JavaFX;
* Suporte a números decimais e frações complexas.

---

## Licença

Uso pessoal e acadêmico.
