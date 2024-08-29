import java.awt.*;
import java.util.Scanner;

public class Atividade2_7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Integer num = 0;

        System.out.println("Digite a o caractere da operação desejada (+, -, /, *): ");
        String operacao = sc.nextLine();
        System.out.println("Digite o primeiro número a ser calculado: ");
        Integer numero1 = sc.nextInt();
        System.out.println("Digite o segundo número a ser calculado: ");
        Integer numero2 = sc.nextInt();

        if (operacao.equals("+")) {
            num = numero1 + numero2;
            System.out.println("O resultado é: " + num);
        }
        if (operacao.equals("-")) {
            num = numero1 - numero2;
            System.out.println("O resultado é: " + num);
        }
        if (operacao.equals("/")) {
            num = numero1 / numero2;
            System.out.println("O resultado é: " + num);
        }
        if (operacao.equals("*")) {
            num = numero1 * numero2;
            System.out.println("O resultado é: " + num);
        }


    }
}
