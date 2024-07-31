import java.util.Scanner;

public class questao3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int sum = 0;
        System.out.println("Insira um número: ");
        int i = sc.nextInt();
        if (i > 0) {
            sum += 1;
        }
        while (i != 0) {
            System.out.println("Insira um número: ");
            i = sc.nextInt();
            if (i > 0) {
                sum += 1;
            }
        }
        System.out.println("Quantidade de positivos: " +sum);
    }
}
