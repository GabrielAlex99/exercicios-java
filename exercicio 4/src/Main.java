import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite o nome da primeira pessoa:");
        String name1 = scanner.next();
        System.out.println("Digite a idade da primeira pessoa:");
        int idade1 = scanner.nextInt();

        System.out.println("Digite o nome da segunda pessoa:");
        String name2 = scanner.next();
        System.out.println("Digite a idade da segunda pessoa:");
        int idade2 = scanner.nextInt();  

        int diferencaIdade = Math.abs(idade1 - idade2);

        System.out.println("A diferença de idade de " + name1 + " e " + name2 + " é de " + diferencaIdade + " anos.");
        }
}