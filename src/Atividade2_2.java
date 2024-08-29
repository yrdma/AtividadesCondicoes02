import java.util.Scanner;

public class Atividade2_2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Integer nota = 0;
        System.out.println("Escreva sua nota: ");
        nota = sc.nextInt();

        if (nota >= 9)
            System.out.println("Excelente");
        else if (nota >= 7) {
            System.out.println("Bom");
        } else if (nota >= 5) {
            System.out.println("Satisfatório");
        } else if (nota < 5) {
            System.out.println("Insatisfatório");
        }


    }

}