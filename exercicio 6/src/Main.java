import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        var scanner = new Scanner(System.in);

        System.out.println("Digite sua altura:");
        var altura = scanner.nextFloat();
        System.out.println("Digite seu peso:");
        var peso = scanner.nextFloat();
        var imc = peso / (altura * altura);

        if (imc <= 18.5) {
            System.out.printf("Seu IMC é: %.2f%n", imc);
            System.out.println("Abaixo do peso.");
        } else if (imc >= 18.6 && imc <= 24.9) {
            System.out.printf("Seu IMC é: %.2f%n", imc);
            System.out.println("Peso ideal.");
        } else if (imc >= 25.0 && imc <= 29.9) {
            System.out.printf("Seu IMC é: %.2f%n", imc);
            System.out.println("Levemente acima do peso.");
        } else if (imc >= 30.0 && imc <= 34.9) {
            System.out.printf("Seu IMC é: %.2f%n", imc);
            System.out.println("Obesidade Grau I");
        } else if (imc >= 35.0 && imc <= 39.9) {
            System.out.printf("Seu IMC é: %.2f%n", imc);
            System.out.println("Obesidade Grau II (Severa).");
        } else if (imc >= 40.0) {
            System.out.printf("Seu IMC é: %.2f%n", imc);
            System.out.println("Obesidade Grau III (Mórbida).");
        }
    }
}