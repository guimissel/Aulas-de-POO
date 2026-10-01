package exercicio3;

import java.util.Scanner;

public class TestaLogin {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Usuário: ");
        String usuario = scanner.nextLine();

        System.out.print("Senha: ");
        String senha = scanner.nextLine();

        Login login = new Login(usuario, senha);

        System.out.println("Fazer login");

        System.out.print("Usuário: ");
        usuario = scanner.nextLine();

        System.out.print("Senha: ");
        senha = scanner.nextLine();

        if (login.fazerLogin(usuario, senha)) System.out.println("Usuário logado!");

        scanner.close();
    }
}
