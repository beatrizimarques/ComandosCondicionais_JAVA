package comandos_condicionais;
import java.util.Scanner;

public class Exercicio_02 {

    public static void main(String[] args) {

        // Verifique se o voto é obrigatório, opcional ou não obrigatório

        int idade;

        Scanner entrada = new Scanner(System.in);

        System.out.println("Entre com a sua idade:");
        idade =  entrada.nextInt();

        if( idade >= 18 && idade <= 69){
            System.out.println("Voto obrigatório!");
        }else if (idade >= 16 || idade > 69){
            System.out.println("Voto opcional!");
        } else{
            System.out.println("Não pode votar!");
        }

    }
}
