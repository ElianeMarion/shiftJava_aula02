import java.util.Scanner;

public class Rodizio {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        //solicite a placa do carro EXH-8694
        //VERIFIQUEM E INFORME O DIA DO RODIZIO
        //1-2: SEGUNDA | 3-4: TERÇA | 5-6: QUARTA
        //7-8: QUINTA  | 9-0: SEXTA
        int placa, digito;
        System.out.println("Digite os números da placa do seu automóvel:");
        placa = leitor.nextInt();
        digito = placa % 10;

        switch (digito){
            case 1:
            case 2:
                System.out.println("Rodizio: Segunda-feira");
                break;
            case 3:
            case 4:
                System.out.println("Rodizio: Terça-feira");
                break;
            case 5:
            case 6:
                System.out.println("Rodizio: Quarta-feira");
                break;
            case 7:
            case 8:
                System.out.println("Rodizio: Quinta-feira");
                break;
            case 9:
            case 0:
                System.out.println("Rodizio: Sexta-feira");
                break;
        }
    }
}
