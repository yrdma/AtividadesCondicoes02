import java.awt.*;
import java.util.Scanner;

public class Atividade2_10 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Double valorComDesconto = 0.0;
        Double desconto = 0.0;
        System.out.println("Digite o valor total da compra: ");
        Double total = sc.nextDouble();
        if (total > 500) {
            desconto = total * 0.2;
            valorComDesconto = total - desconto;
            System.out.println("O valor original era de: " + total);
            System.out.println("Percentual de desconto aplicado foi de: 20%");
            System.out.println("O valor descontado foi de: " + desconto);
            System.out.println("O valor final foi de: " + valorComDesconto);
        } else if (total <= 500 && total >= 200) {
            desconto = total * 0.1;
            valorComDesconto = total - desconto;
            System.out.println("O valor original era de: " + total);
            System.out.println("Percentual de desconto aplicado foi de: 10%");
            System.out.println("O valor descontado foi de: " + desconto);
            System.out.println("O valor final foi de: " + valorComDesconto);
        } else if (total <= 199.99 && total >= 100) {
            desconto = total * 0.05;
            valorComDesconto = total - desconto;
            System.out.println("O valor original era de: " + total);
            System.out.println("Percentual de desconto aplicado foi de: 5%");
            System.out.println("O valor descontado foi de: " + desconto);
            System.out.println("O valor final foi de: " + valorComDesconto);
        } else if (total < 100) {
            desconto = total * 0.0;
            valorComDesconto = total - desconto;
            System.out.println("O valor original era de: " + total);
            System.out.println("Percentual de desconto aplicado foi de: 0%");
            System.out.println("O valor descontado foi de: 0");
            System.out.println("O valor final foi de: " + valorComDesconto);
        }

    }
}