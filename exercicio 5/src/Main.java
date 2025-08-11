import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        var scanner = new Scanner(System.in);
        System.out.println("Digite um número:");
        var number = scanner.nextInt();
        System.out.println("A tabuada de " + number + " é:");

        for (int i = 1; i <= 10; i++) {
            var multi = number * i;
            System.out.println(number + " x " + i + " = " + multi);
        }
    }
}