import java.awt.*;
import java.util.Scanner;

public class Atividade2_11 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Double SalarioCombonus = 0.0;
        Double bonus = 0.0;
        Double impostos = 0.0;
        Double salLiquido = 0.0;
        Double ValorComImpostos = 0.0;
        System.out.println("Digite o salário bruto do funcionário: ");
        Double salBruto = sc.nextDouble();
        System.out.println("Digite a quantos anos o fúncionario trabalhou na empresa:  ");
        Integer anos = sc.nextInt();
        if (anos > 10) {
            SalarioCombonus = salBruto * 1.1;
            bonus = SalarioCombonus - salBruto;
        } else if (anos >= 5 && anos <= 10) {
            SalarioCombonus = salBruto * 1.05;
            bonus = SalarioCombonus - salBruto;
        } else {
            SalarioCombonus = salBruto * 1.00;
            bonus = SalarioCombonus - salBruto;
        }


        if (salBruto >= 5000) {
            impostos = salBruto * 0.27;
            ValorComImpostos = salBruto - impostos;
        } else if (salBruto >= 3000 && salBruto <= 4999.99) {
            impostos = salBruto * 0.18;
            ValorComImpostos = salBruto - impostos;
        } else {
            impostos = salBruto * 0.10;
            ValorComImpostos = salBruto - impostos;
        }
        salLiquido = SalarioCombonus - impostos;
        System.out.println("O salário bruto é de: " + salBruto);
        System.out.println("O bônus recebido foi de: " + bonus);
        System.out.println("O imposto descontado foi de :" + impostos);
        System.out.println("O valor liquido é de: " + salLiquido);

    }
}