package exercicios;

public class Revisao {
    //Função Inicio
    public static void main(String[] args) {
        String[] nomes = {"Amarelo", "Preto", "Laranja"};

        for(String nome: nomes){
            if(nome.equals("Preto")){
                continue;
            }
            // Escreva
            System.out.println(nome);
        }
    }
}

