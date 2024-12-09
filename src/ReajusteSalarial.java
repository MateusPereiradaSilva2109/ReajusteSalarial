import java.util.Scanner;

class ReajusteSalarial {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Solicitar o salário atual do colaborador
        System.out.print("Digite o salário atual do colaborador: R$ ");
        double salarioAtual = scanner.nextDouble();

        // Variáveis para o cálculo
        double percentualAumento;
        double inflacao = 3.8; // Taxa de inflação do período

        // Determinar o percentual de aumento com base no salário atual
        if (salarioAtual <= 280.00) {
            percentualAumento = 20.0;
        } else if (salarioAtual <= 700.00) { // Salários entre 280 e 700
            percentualAumento = 15.0;
        } else if (salarioAtual <= 1500.00) { // Salários entre 700 e 1500
            percentualAumento = 10.0;
        } else { // Salários acima de 1500
            percentualAumento = 5.0;
        }

        // Cálculos
        double valorAumento = salarioAtual * (percentualAumento / 100);
        double novoSalario = salarioAtual + valorAumento;
        double valorInflacao = salarioAtual * (inflacao / 100);
        double valorAumentoReal = valorAumento - valorInflacao;

        // Exibição dos resultados
        System.out.println("\n--- Resultado ---");
        System.out.printf("1. Salário antes do reajuste: R$ %.2f%n", salarioAtual);
        System.out.printf("2. Percentual de aumento aplicado: %.1f%%%n", percentualAumento);
        System.out.printf("3. Valor do aumento: R$ %.2f%n", valorAumento);
        System.out.printf("4. Novo salário, após o aumento: R$ %.2f%n", novoSalario);
        System.out.printf("5. Valor do aumento real (descontado a inflação): R$ %.2f%n", valorAumentoReal);

        scanner.close();
    }
}
