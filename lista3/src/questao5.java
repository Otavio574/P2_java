import java.util.Scanner;

public class questao5 {
    public static boolean isPrimeNumber(int num) {
        int sum = 0;
        for (int i = 1; i <= num; i++) {
            if (num % i == 0) {
                sum += 1;
            }
        }
        if (sum == 2) {
            return true;
        }
        return false;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int number;
        System.out.println("Insira um número: ");
        number = sc.nextInt();

        if (isPrimeNumber(number) == true) {
            System.out.println(number + " É primo");
        }
    }
}


