package comandos_condicionais;
import java.util.Scanner;

public class Exercicio_06 {

    public static void main(String[] args) {

        //Entre com 3 números e exiba o menor deles;

        int numero1, numero2, numero3;

        Scanner entrada = new Scanner(System.in);

        System.out.println("Entre com o primeiro número:");
        numero1 = entrada.nextInt();
        System.out.println("Entre com o segundo número:");
        numero2 = entrada.nextInt();
        System.out.println("Entre com o terceiro número:");
        numero3 = entrada.nextInt();

        if(numero1>numero2 && numero1>numero3){
            System.out.println("O maior número é:" + numero1);
        }else if ( numero2>numero1 && numero2>numero3){
            System.out.println("O maior número é:" + numero2);
        }else{
            System.out.println("O maior número é:" + numero3);
        }

    }
}
