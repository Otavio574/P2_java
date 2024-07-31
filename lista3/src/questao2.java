import java.util.Scanner;

public class questao2 {

    public static void series (int a, int b) {
        System.out.print("Série numérica: ");
        for (int i = a + 1; i < b; i++) {
            System.out.print(+i + " ");
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num1, num2;
        System.out.println("Insira o valor de A: ");
        num1 = sc.nextInt();
        System.out.println("Insira o valor de B: ");
        num2 = sc.nextInt();
        series(num1, num2);
    }
}
