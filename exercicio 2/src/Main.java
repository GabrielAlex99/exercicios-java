import java.util.Scanner;

public class Main {
    public static void main (String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Informe o tamanho do lado do quadrado:");
        int quadrado = scanner.nextInt();
        var area = quadrado * quadrado;
        System.out.println("A área do quadrado é: " + area);
    }
}
