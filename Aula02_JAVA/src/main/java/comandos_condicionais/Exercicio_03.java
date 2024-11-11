package comandos_condicionais;
import java.util.Scanner;

public class Exercicio_03 {

    public static void main(String[] args) {

        // Calcule o IMC e verifique a classificação

        float peso, altura, imc;

        Scanner entrada = new Scanner (System.in);

        System.out.println("Digite seu peso:");
        peso = entrada.nextFloat();
        System.out.println("Digite sua altura:");
        altura = entrada.nextFloat();

        imc = (peso/ (altura*altura));

        if(imc<18.5){
            System.out.println("Você está abaixo do peso!");
        } else if ( imc>=18.6 && imc<=24.9){
            System.out.println("Você está no peso ideal!");
        } else if ( imc>25 && imc<29.9){
            System.out.println("Você está levemente acima do peso!");
        } else if (imc>30 && imc<34.9){
            System.out.println("Você está com obesidade grau I!");
        } else if (imc>35 && imc<39.9){
            System.out.println("Você está com obesidade grau II!");
        }else{
            System.out.println("Você está com obesidade grau III");
        }

    }
}
