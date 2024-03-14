import java.util.Scanner;

public class Login {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        //user = admin - password = admin123 - token - 123
        String user, password, token;
        System.out.println("Informe seu usuário: ");
        user = leitor.nextLine();
        System.out.println("Digite sua senha: ");
        password = leitor.nextLine();
        System.out.println("Digite seu token: ");
        token = leitor.nextLine();

        //ordem: !  ->   &&    ->   ||
        if(user.equalsIgnoreCase("admin") &&
                (password.equals("admin123")|| token.equals("123"))
        ){
            System.out.println(user + ", bem vindo ao sistema Fiap!");
        }
        else{
            System.out.println("Usuário e/ou senha inválidos, favor digitar novamente");
        }


    }
}
