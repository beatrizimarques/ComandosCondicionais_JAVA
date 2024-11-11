package comandos_condicionais;
import java.util.Scanner;

public class Exercicio_05 {

    public static void main(String[] args) {

        //Entre com dois números e exiba o maior deles;

        float numero1, numero2;

        Scanner entrada = new Scanner(System.in);

        System.out.println("Entre com o primeiro número:");
        numero1 = entrada.nextFloat();
        System.out.println("Entre com o segundo número:");
        numero2 = entrada.nextFloat();

        if(numero1>numero2){
            System.out.println("O maior número é:" + numero1);
        }else{
            System.out.println("O maior número é:" + numero2);
        }
    }
}
