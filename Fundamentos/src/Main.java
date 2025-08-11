import java.time.OffsetDateTime;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Informe o seu nome:");
        String name = scanner.next();
        System.out.println("Informe seu ano de nascimento:");
        int age = scanner.nextInt();
        var year = OffsetDateTime.now().getYear();
        System.out.println("Olá, " + name + "! Sua idade é: " + (year - age) + " anos");
    }
}
