    package org.example;

    import java.util.Scanner;

    public class ConversorTemperatura {
        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);

            System.out.println("Deseja converter para Fahrenheit (F) ou para Celsius (C)?");
            String opcao = scanner.nextLine().trim().toUpperCase();

            if (!opcao.equals("F") && !opcao.equals("C")) {
                System.out.println("Opção inválida. Use 'F' para Fahrenheit ou 'C' para Celsius.");
                return;
            }

            System.out.print("Informe o valor da temperatura: ");
            double temperatura = scanner.nextDouble();

            double resultado;

            if (opcao.equals("F")) {

                resultado = (temperatura * 9/5) + 32;
                System.out.printf("%.2f °C equivale a %.2f °F%n", temperatura, resultado);
            } else {

                resultado = (temperatura - 32) * 5/9;
                System.out.printf("%.2f °F equivale a %.2f °C%n", temperatura, resultado);
            }

            scanner.close();
        }
    }
