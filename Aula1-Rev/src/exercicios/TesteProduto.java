package exercicios;

import java.util.Scanner;

public class TesteProduto {

        public static void main(String[] args){
            Produto p1 = new Produto();
            Scanner sc = new Scanner(System.in);
            // Contrutor Default - Implicito
            Produto p2 = new Produto();

            System.out.println("Descrição");
            String descricao = sc.next();
            System.out.println("Valor");
            double valor = sc.nextDouble();

            p1.setDescricao("TV");
            p1.setValor(1500);

            System.out.println(p1.getDescricao() + "-" + p1.getValor());

        }
}
