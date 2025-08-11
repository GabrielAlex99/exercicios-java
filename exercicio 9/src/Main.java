import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // Lê os valores de entrada:
        Scanner leitorDeEntradas = new Scanner(System.in);
        System.out.println("Digite seu salário:");
        float valorSalario = leitorDeEntradas.nextFloat();
        System.out.println("Digite seu benefício:");
        float valorBeneficios = leitorDeEntradas.nextFloat();

        float valorImposto;

        if (valorSalario >= 0 && valorSalario <= 1100) {
            // Alíquota de 5%
            valorImposto = 0.05f * valorSalario;
        } else if (valorSalario >= 1100.01 && valorSalario <= 2500.00) {
            // Alíquota de 10%
            valorImposto = 0.10f * valorSalario;
        } else {
            // Alíquota de 15%
            valorImposto = 0.15f * valorSalario;
        }

        // Calcula e imprime a saída (com 2 casas decimais)
        float saida = valorSalario - valorImposto + valorBeneficios;
        System.out.printf(String.format("O seu salário é: %.2f", saida));
    }
}