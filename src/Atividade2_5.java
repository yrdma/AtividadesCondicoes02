import java.awt.*;
import java.util.Scanner;

public class Atividade2_5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int diaDaSemana = 0;

        System.out.println("Digite um número entre 1 e 7 e descubra o dia da semana: ");
        diaDaSemana = sc.nextInt();
        switch (diaDaSemana) {
            case 1:
                System.out.println("Domingo");
                break;
            case 2:
                System.out.println("Segunda-feira");
                break;
            case 3:
                System.out.println("Terça-feira");
                break;
            case 4:
                System.out.println("Quarta-feira");
                break;
            case 5:
                System.out.println("Quinta-feira");
                break;
            case 6:
                System.out.println("Sexta-feira");
                break;
            case 7:
                System.out.println("Sabado");
                break;

        }

        if (diaDaSemana > 7)
            System.out.println("Error: Digite um número entre 1 e 7");

    }
}
