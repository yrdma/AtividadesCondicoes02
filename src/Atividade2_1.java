import java.util.Scanner;

public class Atividade2_1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Integer idade = 0;
        System.out.println("Escreva sua idade: ");
        idade = sc.nextInt();
        if (idade >= 18)
            System.out.println("Você pode ser preso!! ");
        else
            System.out.println("Você ainda é JUVENIL!!! ");


    }
}

