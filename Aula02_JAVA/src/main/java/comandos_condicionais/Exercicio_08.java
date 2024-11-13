package comandos_condicionais;
import java.util.Scanner;

public class Exercicio_08 {

    public static void main(String[] args) {

        //Use o switch para criar um sistema de farol

        int farol;
        String mensagem;

        Scanner entrada = new Scanner(System.in);
        System.out.println("Entre com um número:");
        farol = entrada.nextInt();

        switch(farol){
            case 1: mensagem = "Farol Verde! Siga em frente!";
            break;
            case 2: mensagem = "Farol Amarelo! Atenção, reduza a velocidade!";
            break;
            case 3: mensagem = "Farol Vermelho! Pare, não siga!";
            break;
            default: mensagem =  "Número inválido!";
        }

        System.out.println("A situação é: " + mensagem);

    }
}
