import java.util.Scanner;

public class Atividade2_4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String login = "ygor";
        String password = "lenda123";
        System.out.println("Digite Login: ");
        String usuario = sc.nextLine();
        System.out.println("Digite Senha: ");
        String senha = sc.nextLine();


        if (login.equals(usuario) && password.equals(senha)) {
            System.out.println("Você entrou na sua conta");
        }
        else {
            System.out.println("Usúario ou senha incorretos");
        }


    }
}