import java.util.Scanner;

public class DecisaoEncadeada {

    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        int idade;

        System.out.println("Por favor, digite sua idade: ");
        idade = leitor.nextInt();
        //Decisão simples só executa o lado verdadeiro
        //sintaxe: if (condicao)
        //condição => variável opRelacional variável/valor
        //resultado => boolean (V ou F)

        if (idade < 16)
            System.out.println("Não pode votar!");
        else if (idade >= 18) {
            System.out.println("Deve votar – é OBRIGATÓRIO");
        }else {
            System.out.println("Você não é obrigado mas, pode votar!");
        }

        //Operadores lógicos
        //E - &&  |   OU - ||   -  Não - !
        if (idade < 16)
            System.out.println("Não pode votar!");
        else if(idade >= 16 && idade < 18)
        {
            System.out.println("Você não é obrigado mas, pode votar!");
        }
        else if (idade >=18 && idade < 75)
        {
            System.out.println("Deve votar – é OBRIGATÓRIO");
        }
        else {
            System.out.println("Você já não é mais obrigado mas, pode votar!");
        }


    }
}

