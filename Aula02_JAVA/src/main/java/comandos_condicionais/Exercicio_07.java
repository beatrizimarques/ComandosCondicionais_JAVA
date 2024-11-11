package comandos_condicionais;
import java.util.Scanner;

public class Exercicio_07 {

    public static void main(String[] args) {

        //Entre com um número e diga se ele é par ou ímpar

        int numero;

        Scanner entrada = new Scanner(System.in);

        System.out.println("Entre com um número e verifique se é par ou ímpar:");
        numero = entrada.nextInt();

        if( numero%2==0 ){
            System.out.println("Este número é par");
        }else{
            System.out.println("Este número é impar");
        }


    }
}
