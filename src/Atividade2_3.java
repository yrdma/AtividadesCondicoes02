import java.awt.*;
import java.util.Scanner;

public class Atividade2_3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
    Integer num = 0;
        System.out.println("Escreva um número para ver se é impar ou par: ");
        num = sc.nextInt();
        if (num % 2 == 0 )
            System.out.println("Seu numero é par!!");
        else if (num % 2 == 1) {
            System.out.println("Seu número é impar!!");
        }

    }
}
