import java.util.Scanner;

public class questao4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a, b;
        System.out.println("Insira o valor de A: ");
        a = sc.nextInt();
        System.out.println("Insira o valor de B: ");
        b = sc.nextInt();

        for (int i = a; i <= b; i++) {
            if (i % 2 != 0) {
                System.out.println("É ímpar: " +i);
            }
        }
    }
}
