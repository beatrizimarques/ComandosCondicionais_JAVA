package comandos_condicionais;
import java.util.Scanner;

public class Exercicio_11 {

    public static void main(String[] args) {

        int salario;
        String mensagem;

        Scanner entrada = new Scanner(System.in);
        System.out.println("Entre com o número referente ao seu cargo:");
        salario = entrada.nextInt();

        switch (salario){
            case 1: mensagem = "O seu cargo é de programador estagiário e seu salário com ajuste é: " + (1400+(1400*0.1));
            break;
            case 2: mensagem = "O seu cargo é de programador júnior e seu salário com ajuste é: " + (3000+(3000*0.12));
            break;
            case 3: mensagem = "O seu cargo é de programador pleno e seu salário com ajuste é: " + (5500+(5500*0.13));
            break;
            case 4: mensagem = "O seu cargo é de programador sênior e seu salário com ajuste é: " + (8000+(8000*0.15));
            break;
            case 5: mensagem = "O seu cargo é de programador master e seu salário com ajuste é: " + (12000+(12000*0.18));
            break;
            default: mensagem= "Cargo inválido!";
        }

        System.out.println(mensagem);
    }
}
