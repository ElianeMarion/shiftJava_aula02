import java.util.Scanner;

public class DescontoOperadorOu {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        Scanner leitorTexto = new Scanner(System.in);
        //total da compra e o cupom
        double valorTotalCompra, desconto = 0, valorFinal;
        String cupom;
        System.out.println("Informe o valor total da compra: ");
        valorTotalCompra = leitor.nextDouble();
        System.out.println("Informe o cupom: ");
        cupom = leitorTexto.nextLine();
        if(valorTotalCompra >= 1000 || cupom.equalsIgnoreCase("DESCONTO20")){
            desconto = valorTotalCompra * 0.2;
        }
        valorFinal = valorTotalCompra - desconto;
        System.out.println("\nCUPOM FISCAL" +
                           "\nValor da compra: R$ " + valorTotalCompra +
                           "\nDesconto: R$ " + desconto +
                           "\nValor final: R$ " + valorFinal);
    }
}
