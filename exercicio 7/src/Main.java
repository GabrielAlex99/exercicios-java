import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        var scanner = new Scanner(System.in);

        System.out.println("Digite um número:");
        var n1 = scanner.nextInt();
        System.out.println("Digite um número maior que o anterior:");
        var n2 = scanner.nextInt();
        System.out.println("Escolha par ou ímpar:");
        var pi = scanner.next();

        if (n2 > n1 && pi.equalsIgnoreCase("par")) {
            for (var i = n2 ; i >= n1 ; i--) {
                if (i % 2 == 0) {
                    System.out.println(i);
                }
            }
        } else if (pi.equalsIgnoreCase("ímpar")) {
            for (var i = n2 ; i >= n1 ; i--) {
                if (i % 2 != 0) {
                    System.out.println(i);
                }
            }
       } else {
            System.out.println("Opção inválida!");
        }
    }
}