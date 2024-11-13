package comandos_condicionais;
import java.util.Scanner;

public class Exercicio_10 {

    public static void main(String[] args) {

        int pedido;
        String mensagem;

        Scanner entrada = new Scanner(System.in);
        System.out.println("Digite seu pedido:");
        pedido = entrada.nextInt();

        switch (pedido){
            case 1: mensagem = "Combo Whopper: O clássico do BK, feito com carne bovina grelhada no fogo como churrasco, alface fresca, tomate, picles, cebola, ketchup, maionese e pão com gergelim.";
            break;
            case 2: mensagem = "Combo Chicken Crispy Bacon: Uma combinação deliciosa de filé de frango empanado crocante, bacon, alface, queijo derretido e maionese especial, servido no macio pão brioche.";
            break;
            case 3: mensagem = "Combo Stacker Triplo: Três camadas de hambúrguer bovino grelhado com queijo derretido entre elas, acompanhado de bacon crocante e o exclusivo molho Stacker no pão com gergelim.";
            break;
            case 4: mensagem = "Combo Big King: Dois hambúrgueres grelhados, queijo derretido, cebola, alface, picles, ketchup e maionese, tudo no pão com gergelim.";
            break;
            case 5: mensagem = "Combo BK Original Chicken: Sanduíche com filé de frango empanado, maionese cremosa e alface fresca, servido no pão longo com gergelim";
            break;
            default: mensagem = "Número inválido!";
        }

        System.out.println("O seu pedido é: " + mensagem);
    }
}
