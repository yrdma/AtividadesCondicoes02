import java.awt.*;
import java.util.Scanner;

public class Atividade2_9 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite um número : ");
        Integer num = sc.nextInt();
        if (num > 0)
            System.out.println("Seu número é positivo");
        else if (num < 0) {
            System.out.println("Seu número é negativo");
        } else if (num == 0) {
            System.out.println("Seu número é zero");
        }


    }
}