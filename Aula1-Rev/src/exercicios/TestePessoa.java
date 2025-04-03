package exercicios;

public class TestePessoa {

    public static void main(String[] args) {
        Pessoa pessoa1 = new Pessoa();
        Pessoa pessoa2 = new Pessoa();

        Pessoa pessoa3 = new Pessoa();

        pessoa1.setNome("Manoel");
        pessoa1.setPeso(65);
        pessoa1.setAltura(1.68);

        pessoa2.setNome("Manuel");
        pessoa2.setPeso(82);
        pessoa2.setAltura(1.85);

        System.out.println(pessoa1.getNome() + " você está " + pessoa1.resultado());
        System.out.println(pessoa2.getNome() + " você está " + pessoa2.resultado());

        // if else em linha
        // serviu pra comparar pessoas
        System.out.println(pessoa1==pessoa2 ? "Iguais" : "Diferentes");
    }

}

