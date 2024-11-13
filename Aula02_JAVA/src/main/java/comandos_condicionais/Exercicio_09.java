package comandos_condicionais;
import java.util.Scanner;

public class Exercicio_09 {

    public static void main(String[] args) {

        //Entre com o número e o programa traz o mês do ano utilizando switch

        int mes;
        String mensagem;

        Scanner entrada = new Scanner(System.in);
        System.out.println("Entre com o número do mês:");
        mes = entrada.nextInt();

        switch (mes){
            case 1: mensagem = "Janeiro";
            break;
            case 2: mensagem = "Fevereiro";
                break;
            case 3: mensagem = "Maio";
                break;
            case 4: mensagem = "Abril";
                break;
            case 5: mensagem = "Março";
                break;
            case 6: mensagem = "Junho";
                break;
            case 7: mensagem = "Julho";
                break;
            case 8: mensagem = "Agosto";
                break;
            case 9: mensagem = "Setembro";
                break;
            case 10: mensagem = "Outubro";
                break;
            case 11: mensagem = "Novembro";
                break;
            case 12: mensagem = "Dezembro";
                break;
            default: mensagem = "Número inválido!";
        }

        System.out.println("O mês do ano correspondente ao número é: " + mensagem);

    }
}
