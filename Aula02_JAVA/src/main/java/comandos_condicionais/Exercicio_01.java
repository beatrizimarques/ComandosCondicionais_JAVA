package comandos_condicionais;
import java.util.Scanner;

public class Exercicio_01 {

    public static void main(String[] args) {

        //Calcule a média e verifique a aprovação ou reprovação

        Scanner notas = new Scanner(System.in);

        System.out.println("Entre com a primeira nota: ");
        float nota1 = notas.nextFloat();

        System.out.println("Entre com a segunda nota:");
        float nota2 = notas.nextFloat();

        System.out.println("Entre com a terceira nota:");
        float nota3 = notas.nextFloat();

        System.out.println("Entre com a quarta nota:");
        float nota4 = notas.nextFloat();

        float media = ((nota1 + nota2 + nota3 + nota4) /4);

        System.out.println("A média das notas é: " + media);

        if(media >=7){
            System.out.println("Está aprovado!");
        }else if(media >= 5){
            System.out.println("Está em recuperação!");
        }else{
            System.out.println("Está reprovado!");
        }

    }

}
