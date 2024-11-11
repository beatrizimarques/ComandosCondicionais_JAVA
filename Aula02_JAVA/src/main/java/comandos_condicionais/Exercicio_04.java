package comandos_condicionais;
import java.util.Scanner;

public class Exercicio_04 {

    public static void main(String[] args) {

        //Descubra o valor de crédito, e com base na média semestral do seu salário:

        float salario, salario1, salario2, salario3, salario4, salario5, salario6;

        Scanner entrada = new Scanner (System.in);

        System.out.println("Digite seu salário do primeiro mês:");
        salario1 = entrada.nextFloat();
        System.out.println("Digite seu salário do segundo mês:");
        salario2 = entrada.nextFloat();
        System.out.println("Digite seu salário do terceiro mês:");
        salario3 = entrada.nextFloat();
        System.out.println("Digite seu salário do quarto mês:");
        salario4 = entrada.nextFloat();
        System.out.println("Digite seu salário do quinto mês:");
        salario5 = entrada.nextFloat();
        System.out.println("Digite seu salário do sexto mês:");
        salario6 = entrada.nextFloat();

        salario = ((salario1 + salario2 + salario3 + salario4 + salario5 + salario6)/6);


        if(salario<=500){
            System.out.println("Você não receberá crédito!");
        }else if(salario>500 && salario<1000){
            System.out.println("Você receberá: " + (salario+(salario*0.3)));
        }else if (salario>1001 && salario<3000) {
            System.out.println("Você receberá: " + (salario+(salario * 0.4)));
        }else{
            System.out.println("Você receberá: " + (salario+(salario * 0.5)));
        }
    }
}
