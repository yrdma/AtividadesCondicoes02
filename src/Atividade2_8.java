import java.util.Scanner;

public class Atividade2_8 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
    System.out.println("Digite a temperatura atual em C°  : ");
    Integer temp = sc.nextInt();
    if (temp >30)
        System.out.println("Quente demais!!");
    else if (temp >= 15 && temp <= 30) {
        System.out.println("Temperatura lendaria!!");
    } else if (temp < 15) {
        System.out.println(" Ta gelado!!");
    }


    }
}