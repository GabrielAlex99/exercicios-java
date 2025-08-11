import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite a base do retângulo:");
        float base = scanner.nextFloat();
        System.out.println("Digite a altura do retângulo:");
        float altura = scanner.nextFloat();
        float area = base * altura;
        System.out.println("A área do retângulo é:" + area);
        }
    }
