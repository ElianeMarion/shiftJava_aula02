import java.util.Scanner;

public class CalculadoraMenu {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        Scanner leitorTexto = new Scanner(System.in);
        //variáveis -> são espaços na memória RAM (int, double, char, String)
        int numero1, numero2, opcaoMenu;
        double soma, subtracao, multiplicacao, divisao;

        //String nome = leitorTexto.nextLine();

        //Comando de saída
        System.out.println("CALCULADORA");
        System.out.println("Digite um número: ");
        //Entrada de dados
        numero1 = leitor.nextInt();
        System.out.println("Digite o segundo número: ");
        numero2 = leitor.nextInt();
        System.out.println("Opções do menu:" +
                           "\n1 - Soma" +
                           "\n2 - Subtração" +
                           "\n3 - Multiplicação" +
                           "\n4 - Divisão" +
                           "\nDigite a opção desejada");
        opcaoMenu = leitor.nextInt();
        if(opcaoMenu == 1){
            soma = numero1 + numero2;
            System.out.println("A soma é: " + String.format("%.0f", soma));
        } else if (opcaoMenu == 2) {
            subtracao = numero1 - numero2;
            System.out.println("A subtração: " + subtracao);
        } else if (opcaoMenu == 3) {
            multiplicacao = numero1 * numero2;
            System.out.println("A multiplicação: " + multiplicacao);
        } else if (opcaoMenu == 4) {
            if(numero2 == 0){
                System.out.println("Não é possível dividir por zero!");
            }else {
                divisao = (double) numero1 / numero2;
                System.out.println("A divisão = " + divisao);
            }
        }else {
            System.out.println("Opção inválida");
        }

    }
}
