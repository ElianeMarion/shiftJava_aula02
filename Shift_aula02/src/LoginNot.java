import java.util.Scanner;

public class LoginNot {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        //user = admin - password = admin123 - token - 123
        String user, password, token, tipoUsuario;
        System.out.println("Informe seu usuário: ");
        user = leitor.nextLine();
        System.out.println("Digite sua senha: ");
        password = leitor.nextLine();
        System.out.println("Digite seu token: ");
        token = leitor.nextLine();
        System.out.println("Digite o tipo do usuário: ");
        tipoUsuario = leitor.nextLine();

        if(!tipoUsuario.equalsIgnoreCase("administrador"))
            System.out.println("Usuário sem privilégios administrativos");
        else{
            System.out.println("PERFIL DE ADIMINISTRADOR");
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
}
